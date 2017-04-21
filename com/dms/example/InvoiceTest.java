package com.dms.example;

import javax.swing.JOptionPane;

/**
 * Class drive of Invoice - testa a implementação de uma fatura.
 */
public class InvoiceTest{

	public static void main(String... args){
		Invoice fatura = new Invoice("126044", "Conversor digital", 120, 62.9);
		String message = String.format("A fatura de Nº %s com o valor total R$ %.2f", fatura.getNumber(), fatura.getInvoiceAmount());
		JOptionPane.showMessageDialog(null, message);
	}
}
