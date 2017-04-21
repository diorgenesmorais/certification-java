package com.dms.example;

/**
 * Class (@code Employee) representa um empregado.
 *
 * @autor Diorgenes Morais
 *
 * @version 1.0.0
 */
public class Employee{

	private String name;
	private String lastName;
	private double salary;

	public Employee(String name, String lastName, double salary){
		this.name = name;
		this.lastName = lastName;
		setSalary(salary);
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public double getSalary(){
		return salary;
	}

	public void setSalary(double salary){
		this.salary = (salary < 0) ? 0 : salary;
	}

	/**
	 * @return Obtém formatado o nome deste e o seu salário anual
	 */
	public String getSalaryYearly(){
		return String.format("Employee: %s%nSalary yearly: R$ %.2f%n", this.name, this.salary * 12);
	}
}
