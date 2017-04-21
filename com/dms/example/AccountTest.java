package com.dms.example;

import javax.swing.JOptionPane;

/**
 * Class driver of Account
 *
 * @autor Diorgenes Morais
 *
 */
public class AccountTest{

	public static void main(String[] args){
		Account conta = new Account("Diorgenes", 5900.0);
		conta.deposit(2800.0);
		JOptionPane.showMessageDialog(null, conta.getName() + " o seu saldo é R$ " + conta.getBalance());
		String value = JOptionPane.showInputDialog("Informe um valor para sacar");
		try{
			conta.withdraw(Double.parseDouble(value));
		}catch(RuntimeException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		JOptionPane.showMessageDialog(null, conta.getName() + ", seu saldo atual é R$ " + conta.getBalance());
	}
}
