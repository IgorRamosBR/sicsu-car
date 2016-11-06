package org.uezo.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;
import org.uezo.model.OrdemDeServicos;

@ManagedBean
@ViewScoped
public class OrdemDeServicosWizard implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private OrdemDeServicos ordemDeServicos;
	
	private boolean skip;
	     
	public OrdemDeServicos getOrdemDeServicos() {
		return ordemDeServicos;
	}

	public void setOrdemDeServicos(OrdemDeServicos ordemDeServicos) {
		this.ordemDeServicos = ordemDeServicos;
	}

		public void save() {        
	        FacesMessage msg = new FacesMessage("Ordem De serviço gerada com Sucesso!", "Cliente:" );
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	    
	    public void saveEdit(){
	    	FacesMessage msg = new FacesMessage("Atualizado com Sucesso!");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	     
	    public boolean isSkip() {
	        return skip;
	    }
	 
	    public void setSkip(boolean skip) {
	        this.skip = skip;
	    }
	     
	    public String onFlowProcess(FlowEvent event) {
	        if(skip) {
	            skip = false;   //reset in case user goes back
	            return "confirm";
	        }
	        else {
	            return event.getNewStep();
	        }
	    }

}
