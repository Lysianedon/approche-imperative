package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		
//		Write a program that asks the user for a number then calculates the sum of all whole numbers between 1 and that number. For example, if the user enters 5, the program outputs: 15.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ecrire un nombre: ");
		int nb = scanner.nextInt();
		
		int result = 0;
		
		if(nb > 0) {
			for(int i = 1; i <= nb; i++) {
				result += i;
				
			}
			
		} else if(nb < 1) {
			for(int i = nb; i <= 1; i++) {
				System.out.println(i);
				result += i;
				
			}
			
		}
		 System.out.println(result);
		

	}

}
