package com.dms.example;

/**
 * Está classe é uma representação simples de uma fatura (exercício proposto 3.12)
 *
 * @autor Diorgenes Morais
 *
 * @version 1.0.0
 */
public class Invoice{

	private String number;
	private String descrition;
	private int quantity;
	private double unitPrice;

	public Invoice(String number, String descrition, int quantity, double unitPrice){
		this.number = number;
		this.descrition = descrition;
		setQuantity(quantity);
		setUnitPrice(unitPrice);
	}

	public String getNumber(){
		return number;
	}

	public void setNumber(String number){
		this.number = number;
	}

	public String getDescrition(){
		return descrition;
	}

	public void setDescrition(String descrition){
		this.descrition = descrition;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setQuantity(int quantity){
		this.quantity = (quantity < 0) ? 0 :  quantity;
	}

	public double getUnitPrice(){
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice){
		this.unitPrice = (unitPrice < 0) ? 0 : unitPrice;
	}

	/**
	 * Obtém o valor total desta fatura.
	 */
	public double getInvoiceAmount(){
		return (quantity * unitPrice);
	}
}
