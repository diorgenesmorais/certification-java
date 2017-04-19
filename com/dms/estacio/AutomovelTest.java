package com.dms.estacio;

public class AutomovelTest{

	public static void main(String[] args){
		Automovel gol = new Automovel();
		gol.setModelo("GTX");
		gol.setCor("Vermelho");
		gol.setAno(2000);
		gol.ligarMotor();
		System.out.println(gol.getModelo() + " ligado? " + gol.isEstadoMotor());
	}
}
