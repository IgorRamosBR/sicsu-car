package org.uezo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.uezo.model.Peca;

@ManagedBean
@ViewScoped
public class PecaBean {
	
	private List<Peca> pecas;
	private Peca pecaSelecionada;
	
		private int pecaId;
	 
	    @PostConstruct
	    public void init() {
	    	pecas = listaDePecas();
	    }
	     
	    public List<Peca> getPecas() {
	        
	    	return pecas;
	    }
	
	    public Peca getPecaSelecionada() {
			return pecaSelecionada;
		}

		public void setPecaSelecionada(Peca pecaSelecionado) {
			this.pecaSelecionada = pecaSelecionada;
		}

		public int getPecaId() {
			return pecaId;
		}

		public void setPecaId(int pecaId) {
			this.pecaId = pecaId;
		}
		
		//Improvisado para apresentar telas
		public void getPecaById(){
			
			pecaSelecionada = pecas.get(pecaId - 1);
			
		}

		public List<Peca> listaDePecas(){
	    	List<Peca> lista = new ArrayList<>();
	    	
	    	Peca peca1 = new Peca();
	    		peca1.setId(1);
	    		peca1.setNome("Pneu");
	    		peca1.setValor(200);
	    		peca1.setQuantidade(30);
	    		
	    	
	    	Peca peca2 = new Peca();
	    		peca2.setId(2);
	    		peca2.setNome("Parafuso nº 1");
	    		peca2.setValor(10);
	    		peca2.setQuantidade(50);
	    		
	    	lista.add(peca1);
	    	lista.add(peca2);
	    	return lista;
	    }

}
