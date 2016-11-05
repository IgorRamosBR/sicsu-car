package org.uezo.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;
import org.uezo.model.Mecanico;

@ManagedBean
@ViewScoped
public class MecanicoWizard  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Mecanico mecanico= new Mecanico();
     
	    private boolean skip;
	     
	    public Mecanico getMecanico() {
	        return mecanico;
	    }
	 
	    public void setMecanico(Mecanico mecanico) {
	        this.mecanico = mecanico;
	    }
	     
	    public void save() {        
	        FacesMessage msg = new FacesMessage("Cadastrado com Sucesso!", "Bem vindo:" + mecanico.getNome());
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
