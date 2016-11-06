package org.uezo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.uezo.model.Servico;

@ManagedBean
@ViewScoped
public class ServicoBean {
	
	private List<Servico> servicos;
	private Servico servicoSelecionado;
	
		private int servicoId;
	 
	    @PostConstruct
	    public void init() {
	    	servicos = listaDeServicos();
	    }
	     
	    public List<Servico> getServicos() {
	        
	    	return servicos;
	    }
	
	    public Servico getServicoSelecionado() {
			return servicoSelecionado;
		}

		public void setServicoSelecionado(Servico servicoSelecionado) {
			this.servicoSelecionado = servicoSelecionado;
		}

		public int getServicoId() {
			return servicoId;
		}

		public void setServicoId(int servicoId) {
			this.servicoId = servicoId;
		}
		
		//Improvisado para apresentar telas
		public void getServicoById(){
			
			servicoSelecionado = servicos.get(servicoId - 1);
			
		}

		public List<Servico> listaDeServicos(){
	    	List<Servico> lista = new ArrayList<>();
	    	
	    	Servico servico1 = new Servico();
	    		servico1.setId(1);
	    		servico1.setTipo("Troca de Pneu");
	    		servico1.setValor(50);
	    		
	    	
	    	Servico servico2 = new Servico();
	    		servico2.setId(2);
	    		servico2.setTipo("Troca de Óleo");
	    		servico2.setValor(20);
    		
	    	lista.add(servico1);
	    	lista.add(servico2);
	    	return lista;
	    }

}
