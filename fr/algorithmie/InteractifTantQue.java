package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
//		Write a program that asks the user for a number, which must be between 1 and 10:
//			As long as the number is not between 1 and 10, the program repeatedly asks for a number from the user.
//			If the number is between 1 and 10, the program displays the number and ends.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ecrire un nombre compris entre 1 et 10: ");
		int nb = scanner.nextInt();
		
		while(nb > 10 || nb < 1) {
			System.out.print("Ecrire un nombre compris entre 1 et 10: ");
			nb = scanner.nextInt();
		}
		
		 System.out.println(nb);
	}

}
