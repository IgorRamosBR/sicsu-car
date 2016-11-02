package main.java.org.uezo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import main.java.org.uezo.model.Cliente;

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
	    		//PESSOAL
	    		cliente1.setNome("Lucas");
	    		cliente1.setSobrenome("Garcez");
	    		cliente1.setIdade(20);
	    		//ENDERECO
	    		cliente1.setCidade("Rio de Janeiro");
	    		cliente1.setBairro("Guadalupe");
	    		cliente1.setRua("Azevedo");
	    		cliente1.setLogradouro("870");
	    		//CONTATO
	    		cliente1.setTelefone("974032234");
	    		cliente1.setEmail("lucas@gmail.com");
	    		
	    	
	    	Cliente cliente2 = new Cliente();
		    	//PESSOAL
	    		cliente2.setNome("Carlos");
	    		cliente2.setSobrenome("Oliveira");;
	    		cliente2.setIdade(23);
	    		//ENDERECO
	    		cliente2.setCidade("Rio de Janeiro");
	    		cliente2.setBairro("Campo Grande");
	    		cliente2.setRua("Manuel Caldeira");
	    		cliente2.setLogradouro("300");
	    		//CONTATO
	    		cliente2.setTelefone("934042265");
	    		cliente2.setEmail("carlos@gmail.com");
	    		
	    	lista.add(cliente1);
	    	lista.add(cliente2);
	    	return lista;
	    }

}
