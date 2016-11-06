package org.uezo.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.uezo.model.Mecanico;
import org.uezo.model.OrdemMock;

@ManagedBean
@ViewScoped
public class OrdemDeServicosBean {
	
	//lista de objetso Mock para a tela principal da Ordem de Servico
	private List<OrdemMock> ordensDeServicos;
	
	private List<Mecanico> mecanicos;
	
	private Mecanico mecanico;
	
	 @PostConstruct
	 public void init() {
		 ordensDeServicos = listaDeOrdensDeServicos();
		 
		 mecanico = new Mecanico();
		 mecanicos = new ArrayList<Mecanico>();
	 }
	 
	 public List<OrdemMock> getOrdensDeServicos(){
		 
		 return ordensDeServicos;
	 }
	

	private List<OrdemMock> listaDeOrdensDeServicos() {
		
		List<OrdemMock> lista = new ArrayList<OrdemMock>();
		
		OrdemMock ordem1 = new OrdemMock();
		OrdemMock ordem2 = new OrdemMock();
		OrdemMock ordem3 = new OrdemMock();
		
		ordem1.setCliente("Lucas");
		ordem1.setDataPrevista(Calendar.getInstance());
		ordem1.setVeiculo("Fox");
		ordem1.setStatus("Em Avalia��o");
		
		ordem2.setCliente("Igor");
		ordem2.setVeiculo("Astra");
		ordem2.setDataPrevista(Calendar.getInstance());
		ordem2.setStatus("Em Execu��o");
		
		ordem3.setCliente("Tainara");
		ordem3.setVeiculo("Corsa");
		ordem3.setDataPrevista(Calendar.getInstance());
		ordem3.setStatus("Em Execu��o");
		
		lista.add(ordem1);
		lista.add(ordem2);
		lista.add(ordem3);
		
		return lista;
	}
	
	public String reinit() {
        mecanico = new Mecanico();
        return null;
    }
	
	public void createNew() {
		
		System.out.println("CREATE NEW - " + mecanico.getNome());
        if(mecanicos.contains(mecanico)) {
            FacesMessage msg = new FacesMessage("Duplicado!", "Esse Mec�nico j� foi adicionado");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } 
        else {
            mecanicos.add(mecanico);
            mecanico = new Mecanico();
        }
    }

	public List<Mecanico> getMecanicos() {
		return mecanicos;
	}

	public void setMecanicos(List<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	
	
}
