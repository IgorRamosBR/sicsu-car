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
	private Cliente clienteSelecionado;
	
		private int clienteId;
	 
	    @PostConstruct
	    public void init() {
	    	clientes = listaDeClientes();
	    }
	     
	    public List<Cliente> getClientes() {
	        
	    	return clientes;
	    }
	
	    public Cliente getClienteSelecionado() {
			return clienteSelecionado;
		}

		public void setClienteSelecionado(Cliente clienteSelecionado) {
			this.clienteSelecionado = clienteSelecionado;
		}

		public int getClienteId() {
			return clienteId;
		}

		public void setClienteId(int clienteId) {
			this.clienteId = clienteId;
		}
		
		//Improvisado para apresentar telas
		public void getClienteById(){
			
			clienteSelecionado = clientes.get(clienteId - 1);
			
		}

		public List<Cliente> listaDeClientes(){
	    	List<Cliente> lista = new ArrayList<>();
	    	
	    	Cliente cliente1 = new Cliente();
	    		cliente1.setId(1);
	    		//PESSOAL
	    		cliente1.setNome("Lucas");
	    		cliente1.setSobrenome("Garcez");
	    		//ENDERECO
	    		cliente1.setCidade("Rio de Janeiro");
	    		cliente1.setBairro("Guadalupe");
	    		cliente1.setRua("Azevedo");
	    		cliente1.setNumero("450");
	    		//CONTATO
	    		cliente1.setTelefone("974032234");
	    		cliente1.setEmail("lucas@gmail.com");
	    		
	    	
	    	Cliente cliente2 = new Cliente();
	    		cliente2.setId(2);
		    	//PESSOAL
	    		cliente2.setNome("Carlos");
	    		cliente2.setSobrenome("Oliveira");;
	    		//ENDERECO
	    		cliente2.setCidade("Rio de Janeiro");
	    		cliente2.setBairro("Campo Grande");
	    		cliente2.setRua("Manuel Caldeira");
	    		cliente2.setNumero("300");
	    		//CONTATO
	    		cliente2.setTelefone("934042265");
	    		cliente2.setEmail("carlos@gmail.com");
	    		
	    	lista.add(cliente1);
	    	lista.add(cliente2);
	    	return lista;
	    }

}
