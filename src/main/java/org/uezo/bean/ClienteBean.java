package org.uezo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.uezo.model.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean {
	
	private List<Cliente> clientes;
	 
	    @PostConstruct
	    public void init() {
	    	clientes = listaDeClientes();
	    }
	     
	    public List<Cliente> getClientes() {
	        
	    	return clientes;
	    }
	    
	    
	    public List<Cliente> listaDeClientes(){
	    	List<Cliente> lista = new ArrayList<>();
	    	
	    	Cliente cliente1 = new Cliente();
	    		cliente1.setNome("Nome");
	    		cliente1.setEmail("email@gmail.com");
	    		cliente1.setTelefone("99999999");
	    	
	    	Cliente cliente2 = new Cliente();
	    		cliente2.setNome("Nome");
	    		cliente2.setEmail("email@gmail.com");
	    		cliente2.setTelefone("99999999");
	    	
	    	lista.add(cliente1);
	    	lista.add(cliente2);
	    	return lista;
	    }

}
