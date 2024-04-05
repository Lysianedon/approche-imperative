package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		//	Print numbers from 1 to 10;
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i + 1);		
		}
		
		//	Print my name 20 times
		for (int i = 0; i < 20; i++) {
			System.out.println("Lysiane D.");
		}
		//	Print even numbers between 2 and 100
		for (int i = 2; i <= 100; i++) {
			
			if(i%2 == 0) {
				
				System.out.println(i);
			}
		}
		//	Print uneven numbers between 1 and 99
		for (int i = 0; i <= 100; i++) {
			
			if(i%2 == 1) {
				
				System.out.println(i);
			}
		}

	}

}
