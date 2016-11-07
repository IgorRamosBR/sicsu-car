package org.uezo.model;

import java.io.Serializable;

public class Veiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int ano;
	
	private String placa;
	
	private String marca;
	
	private String modelo;

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
