package com.dms.example;

import javax.swing.JOptionPane;

public class EmployeeTest{

	public static void displaySalaryYearly(Employee employee){	
		String message = employee.getSalaryYearly();
		JOptionPane.showMessageDialog(null, message);
		System.out.println(message);
	}

	public static void main(String[] args){
		Employee laudeci = new Employee("Laudeci", "Rodrigues", 1400.0);
		Employee junior = new Employee("Diorgenes", "Filho", 980.0);

		displaySalaryYearly(laudeci);
		displaySalaryYearly(junior);
		
		// aumento salárial de 10%
		laudeci.setSalary(laudeci.getSalary() * 1.1);
		junior.setSalary(junior.getSalary() * 1.1);
		
		displaySalaryYearly(laudeci);
		displaySalaryYearly(junior);
	}
}
