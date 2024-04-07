package fr.algorithmie;

import java.util.Scanner;

public class InteractiveTableMult {
//	Write a program that asks the user for a number that must be between 1 and 10. 
//	Once the number is confirmed to be between 1 and 10, the program displays the multiplication table for that number. 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ecrire un nombre compris entre 1 et 10: ");
		int nb = scanner.nextInt();
		
		while(nb > 10 || nb < 1) {
			System.out.print("Ecrire un nombre compris entre 1 et 10: ");
			nb = scanner.nextInt();
		}
		
		for(int i = 1; i <= 10; i++) {
			 System.out.println(nb + " * " + i + " = " + nb * i);
		}

	}

}
