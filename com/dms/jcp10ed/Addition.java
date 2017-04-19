package com.dms.jcp10ed;

import java.util.Scanner; // o programa utiliza a classe Scanner

public class Addition{

	public static void main(String... args){
		// criar um Scanner para obter entrada apartir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;

		System.out.print("Entre com o primeiro número: ");
		number1 = input.nextInt();

		System.out.print("Entre com o segundo número: ");
		number2 = input.nextInt();

		sum = number1 + number2; // sum obtém o valor de number1 + number2
		System.out.printf("A soma dos dois números é %d%n", sum);
	}
}
