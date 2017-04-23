package com.dms.jcp10ed;

import java.util.Scanner;

/**
 * Calculo de média com inteiro
 *
 * @autor Diorgenes Morais
 *
 * @version 1.0.0
 */
public class AverageWithInteger{

	/**
	 * Detect or prevent integer overflow
	 * source: https://www.securecoding.cert.org/confluence/display/java/NUM00-J.+Detect+or+prevent+integer+overflow
	 */
	public static final int safeAdd(int left, int right){
		if (right > 0 ? left > Integer.MAX_VALUE - right
                	: left < Integer.MIN_VALUE - right) {
    			throw new ArithmeticException("Integer overflow");
  		}
  		return left + right;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int total = 0;
		int gradeCounter = 1;

		while(gradeCounter <= 10){
			System.out.print("Enter grade: ");
			total = safeAdd(total, input.nextInt());
			gradeCounter++;
		}

		int average = total / 10;
		System.out.printf("%nTotal of all 10 grades is %d%nAverage with integer is %d%n", total, average);
	}
}
