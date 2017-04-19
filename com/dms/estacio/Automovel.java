package com.dms.estacio;

public class Automovel{
	private String modelo;
	private String cor;
	private int ano;
	private boolean estadoMotor;

	public String getModelo(){
		return this.modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public String getCor(){
		return this.cor;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public int getAno(){
		return this.ano;
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public boolean isEstadoMotor(){
		return this.estadoMotor;
	}

	public void ligarMotor(){
		this.estadoMotor = true;
	}

	public void desligarMotor(){
		this.estadoMotor = false;
	}
}
