package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		// Write a program that asks the user for 10 numbers and then displays the largest among them.
		Scanner scanner = new Scanner(System.in);

		int nb = 0;
		int maxNumber = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Ecrire nombre n° " + (i) + ": ");
			nb = scanner.nextInt();
			maxNumber = nb > maxNumber ? nb : maxNumber;
			
		}
		
		System.out.println("The biggest number is: " + maxNumber); 


	}

}
