package org.uezo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.uezo.model.Veiculo;

@ManagedBean
@ViewScoped
public class VeiculoBean {
	
	private List<Veiculo> veiculos;
	private List<Veiculo> veiculosAdicionados;
	private Veiculo veiculoSelecionado;
	private int veiculoId;
	 
	    @PostConstruct
	    public void init() {
	    	veiculos = listaDeVeiculos();
	    	veiculosAdicionados = new  ArrayList<Veiculo>();
	    	veiculoSelecionado = new Veiculo();
	    }
	     
	    public List<Veiculo> getVeiculos() {
	        
	    	return veiculos;
	    }
	
	    public Veiculo getVeiculoSelecionado() {
			return veiculoSelecionado;
		}

		public void setVeiculoSelecionado(Veiculo veiculoSelecionado) {
			this.veiculoSelecionado = veiculoSelecionado;
		}

		public int getVeiculoId() {
			return veiculoId;
		}

		public void setVeiculoId(int veiculoId) {
			this.veiculoId = veiculoId;
		}
		
		//Improvisado para apresentar telas
		public void getVeiculoById(){
			
			veiculoSelecionado = veiculos.get(veiculoId - 1);
			
		}

		public List<Veiculo> listaDeVeiculos(){
	    	List<Veiculo> lista = new ArrayList<>();
	    	
	    	Veiculo veiculo1 = new Veiculo();
	    	veiculo1.setAno(2008);
    		veiculo1.setPlaca("JKL2069");
    		veiculo1.setMarca("Fiat");
    		veiculo1.setModelo("Palio");
    				
	    	
	    	Veiculo veiculo2 = new Veiculo();
	    	veiculo2.setAno(2010);
    		veiculo2.setPlaca("JRC6953");
    		veiculo2.setMarca("Fox");
    		veiculo2.setModelo("Volksvagen");		
    		
	    	lista.add(veiculo1);
	    	lista.add(veiculo2);
	    	return lista;
	    }
		
		//Metódos para o componente collector
		
		public void createNew() {
			
	        if(veiculosAdicionados.contains(veiculoSelecionado)) {
	            FacesMessage msg = new FacesMessage("Dublicated", "This book has already been added");
	            FacesContext.getCurrentInstance().addMessage(null, msg);
	        } 
	        else {
	            veiculosAdicionados.add(veiculoSelecionado);
	            veiculoSelecionado = new Veiculo();
	        }
	    }
		
		public String reinit() {
	        veiculoSelecionado = new Veiculo();
	         
	        return null;
	    }

		public List<Veiculo> getVeiculosAdicionados() {
			return veiculosAdicionados;
		}

		public void setVeiculosAdicionados(List<Veiculo> veiculosAdicionados) {
			this.veiculosAdicionados = veiculosAdicionados;
		}
		
		

}
