package org.uezo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.uezo.model.OrdemMock;

@ManagedBean
@ViewScoped
public class OrdemDeServicosBean {
	
	private List<OrdemMock> ordensDeServicos;
	
	 @PostConstruct
	 public void init() {
		 ordensDeServicos = listaDeOrdensDeServicos();
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
		ordem1.setVeiculo("Fox");
		ordem1.setStatus("Em Avaliação");
		
		ordem2.setCliente("Igor");
		ordem2.setVeiculo("Astra");
		ordem2.setStatus("Em Execução");
		
		ordem3.setCliente("Tainara");
		ordem3.setVeiculo("Corsa");
		ordem3.setStatus("Em Execução");
		
		lista.add(ordem1);
		lista.add(ordem2);
		lista.add(ordem3);
		
		return lista;
	}
}
