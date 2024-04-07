package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		
//		Write a program that asks the user for a number then displays the next 10 numbers. For example, if the user enters 5, the program outputs: 6, 7, 8, 9, 10, 11, 12, 13, 14, 15.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ecrire un nombre: ");
		int nb = scanner.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			 System.out.println(i + nb);
		}

	}

}
