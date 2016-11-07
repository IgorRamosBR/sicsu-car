package org.uezo.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;
import org.uezo.model.Veiculo;

@ManagedBean
@ViewScoped
public class VeiculoWizard  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Veiculo veiculo= new Veiculo();
     
	    private boolean skip;
	     
	    public Veiculo getVeiculo() {
	        return veiculo;
	    }
	 
	    public void setVeiculo(Veiculo veiculo) {
	        this.veiculo = veiculo;
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
