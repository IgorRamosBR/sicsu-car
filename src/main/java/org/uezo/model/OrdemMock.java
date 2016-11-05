package org.uezo.model;

import java.io.Serializable;

/*Classe criada para simular uma Ordem de Servico.
 * Possui apenas os atributos que aparecem na tabela da
 * tela principal. Seu principal objetivo é poupar o tempo
 * que seria gasto para implentar as dependencias (Cliente e Veículo)
 * da ordem de Serviço e fazer com que elas sejam exibidas na tabela*/
public class OrdemMock implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cliente;
	
	private String veiculo;
	
	private String status;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
