package com.dms.example;

import javax.swing.JOptionPane;

public class EmployeeTest{

	public static void main(String[] args){
		Employee laudeci = new Employee("Laudeci", "Rodrigues", 1400.0);
		Employee junior = new Employee("Diorgenes", "Filho", 980.0);
		String message = laudeci.getSalaryYearly();
		JOptionPane.showMessageDialog(null, message);
		System.out.println(message);
		message = junior.getSalaryYearly();
		JOptionPane.showMessageDialog(null, message);
		System.out.println(message);
		// aumento salárial de 10%
		laudeci.setSalary(laudeci.getSalary() * 1.1);
		junior.setSalary(junior.getSalary() * 1.1);
		message = laudeci.getSalaryYearly();
		JOptionPane.showMessageDialog(null, message);
		System.out.println(message);
		message = junior.getSalaryYearly();
		JOptionPane.showMessageDialog(null, message);
		System.out.println(message);
	}
}
