package org.uezo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.uezo.model.Mecanico;

@ManagedBean
@ViewScoped
public class MecanicoBean {
	
	private List<Mecanico> mecanicos;
	private Mecanico mecanicoSelecionado;
	
		private int mecanicoId;
	 
	    @PostConstruct
	    public void init() {
	    	mecanicos = listaDeMecanicos();
	    }
	     
	    public List<Mecanico> getMecanicos() {
	        
	    	return mecanicos;
	    }
	
	    public Mecanico getMecanicoSelecionado() {
			return mecanicoSelecionado;
		}

		public void setMecanicoSelecionado(Mecanico mecanicoSelecionado) {
			this.mecanicoSelecionado = mecanicoSelecionado;
		}

		public int getMecanicoId() {
			return mecanicoId;
		}

		public void setMecanicoId(int mecanicoId) {
			this.mecanicoId = mecanicoId;
		}
		
		//Improvisado para apresentar telas
		public void getMecanicoById(){
			
			mecanicoSelecionado = mecanicos.get(mecanicoId - 1);
			
		}

		public List<Mecanico> listaDeMecanicos(){
	    	List<Mecanico> lista = new ArrayList<>();
	    	
	    	Mecanico mecanico1 = new Mecanico();
	    		mecanico1.setId(1);
	    		//PESSOAL
	    		mecanico1.setNome("João");
	    		mecanico1.setSobrenome("Silva");
	    		//ENDERECO
	    		mecanico1.setCidade("Rio de Janeiro");
	    		mecanico1.setBairro("Campo Grande");
	    		mecanico1.setRua("Campo Grande");
	    		mecanico1.setNumero("224");
	    		//CONTATO
	    		mecanico1.setTelefone("55555555");
	    		mecanico1.setEmail("joaoSilva@gmail.com");
	    		
	    	
	    	Mecanico mecanico2 = new Mecanico();
	    		mecanico2.setId(2);
		    	//PESSOAL
	    		mecanico2.setNome("André");
	    		mecanico2.setSobrenome("Muniz");;
	    		//ENDERECO
	    		mecanico2.setCidade("Rio de Janeiro");
	    		mecanico2.setBairro("Campo Grande");
	    		mecanico2.setRua("Serraria");
	    		mecanico2.setNumero("102");
	    		//CONTATO
	    		mecanico2.setTelefone("333333333");
	    		mecanico2.setEmail("AndreMuniz@gmail.com");
	    		
	    	lista.add(mecanico1);
	    	lista.add(mecanico2);
	    	return lista;
	    }

}
