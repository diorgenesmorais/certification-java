package com.dms.example;

import javax.swing.JOptionPane;

public class NameDialog{

	public static void main(String... args){
		// pede para o usuário inserir o seu nome
		String name = JOptionPane.showInputDialog("What's your name?");

		String message = String.format("Welcome, %s, to java programming!", name);

		JOptionPane.showMessageDialog(null, message);
	}
}
