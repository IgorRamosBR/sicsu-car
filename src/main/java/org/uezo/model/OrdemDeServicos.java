package org.uezo.model;

import java.io.Serializable;
import java.util.Calendar;

public class OrdemDeServicos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Calendar dataEmissao;
	
	private Calendar dataPrevista;
	
	private Calendar dataConclusao;
	
	private double valorTotal;
	
	private String relatoDoCliente;
	
	private String observacoes;
	
	/*Quando o sistema for implementado esse status 
	pode virar um enum. Colocado como String para facilitar
	essa primeira parte de prototipação e apresentação do 
	trabalho*/
	private String status;
	
	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Calendar getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(Calendar dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public Calendar getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Calendar dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRelatoDoCliente() {
		return relatoDoCliente;
	}

	public void setRelatoDoCliente(String relatoDoCliente) {
		this.relatoDoCliente = relatoDoCliente;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	
	

}
