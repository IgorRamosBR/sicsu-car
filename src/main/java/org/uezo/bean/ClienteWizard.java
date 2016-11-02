package org.uezo.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;
import org.uezo.model.Cliente;

@ManagedBean
@ViewScoped
public class ClienteWizard  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Cliente cliente= new Cliente();
     
	    private boolean skip;
	     
	    public Cliente getCliente() {
	        return cliente;
	    }
	 
	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }
	     
	    public void save() {        
	        FacesMessage msg = new FacesMessage("Cadastrado com Sucesso!", "Bem vindo:" + cliente.getNome());
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
