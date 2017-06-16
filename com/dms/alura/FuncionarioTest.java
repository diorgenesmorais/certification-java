package com.dms.alura;

public class FuncionarioTest {

	public static void main(String... args){
		Funcionario joao = new Funcionario();
		joao.setSalario(1100.0);
		System.out.printf("Bonus funcionário: %.2f%n", joao.getBonus());
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		System.out.printf("Bonus Gerente: %.2f%n", joaquim.getBonus());
	}
}
