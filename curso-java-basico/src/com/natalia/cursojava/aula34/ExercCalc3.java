package com.natalia.cursojava.aula34;

import java.util.Scanner;

public class ExercCalc3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Entre com um n�mero positivo");
			num = scan.nextInt();
			
			if (num < 0) {
				System.out.println("N�mero inv�lido, entre novamente");
			}
			
		} while (num < 0); 
		
		System.out.println(Calculadora.fatorial(num));
	}

}
