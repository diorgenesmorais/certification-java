package com.dms.alura;

public class Funcionario {
	private String nome;
	protected double salario;

	public void setSalario(double salario){
		this.salario = salario;
	}

	public double getBonus(){
		return salario * 0.2;
	}
}
