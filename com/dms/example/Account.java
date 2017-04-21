package com.dms.example;

/**
 * 
 * @autor Diorgenes Morais
 * @version 1.0.0
 */
public class Account{

	private String name;
	private double balance;

	public Account(String name, double balance){
		this.name = name;
		if(balance > 0.0)
			this.balance = balance;
	}

	public void deposit(double depositAmount){
		if(depositAmount > 0.0)
			this.balance += depositAmount;
	}

	public void withdraw(double value){
		if(value > this.balance)
			throw new RuntimeException("Withdrawal amount exceeded account balance");
		this.balance -= value;
	}

	public double getBalance(){
		return balance;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}
