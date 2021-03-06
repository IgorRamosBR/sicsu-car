package org.uezo.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;
import org.uezo.model.Servico;

@ManagedBean
@ViewScoped
public class ServicoWizard  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Servico servico= new Servico();
     
	    private boolean skip;
	     
	    public Servico getServico() {
	        return servico;
	    }
	 
	    public void setServico(Servico servico) {
	        this.servico = servico;
	    }
	     
	    public void save() {        
	        FacesMessage msg = new FacesMessage("Servi�o inclu�do com Sucesso!");
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
