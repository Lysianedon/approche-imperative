package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
//		Write a game that:
//
//			Chooses a random number between 1 and 100.
//			Then asks the user to find the number by indicating whether it's higher or lower than their guess.
//			When the user finds the number, the program outputs "Bravo, you've found the number in N tries" where N represents the number of guesses made by the user.
//			The program ends.
	Scanner scanner = new Scanner(System.in);
	String initialPrompt = "Trouve le nombre mystère compris entre 1 et 100: ";
	System.out.print(initialPrompt);
	
	int nb = scanner.nextInt();
	int answer = 89;
	int nbTries = 1;
		
		
	String hintPrompt = "";
	
	while(nb != answer) {
		
		if(nb > 100) {
			hintPrompt = "Nombre incorrect." ;
		} else if(nb > answer ) {
			hintPrompt = "Tu es au-dessus...";
		} else if (nb < answer) {
			hintPrompt = "Tu es en-dessous...";
		}
		System.out.print(hintPrompt + " " + initialPrompt);
		nb = scanner.nextInt();
		nbTries++;
	}
	System.out.println("Bravo, tu as trouvé le nombre mystère " + answer + " en " + nbTries + " fois !");
	System.out.println(nb);

	}

}
