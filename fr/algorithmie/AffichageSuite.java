package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		
//		Use a for loop to display all numbers from 1 to 10 inclusive.
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);		
		}
//		Use a for loop to display all even numbers between 0 and 10 inclusive.
		for (int i = 0; i <= 10; i++) {
			
			if(i % 2 == 0) System.out.println(i);
		}
		
//		Use a for loop to display all odd numbers between 0 and 9 inclusive.
		for (int i = 0; i < 10; i++) {
			
			if(i % 2 == 1) System.out.println(i);
		}
//		Use a while loop to display all numbers from 1 to 10 inclusive.
		int l = 1;
		while(l <= 10) {
			System.out.println(l);
			l++;
		}
//		Use a while loop to display all even numbers between 0 and 10 inclusive.
		int m = 1;
		while(m <= 10) {
			if(m % 2 == 0) System.out.println(m);
			m++;
		}
		
//		Use a while loop to display all odd numbers between 0 and 9 inclusive.
		int n = 0;
		while(n < 10) {
			if(n % 2 == 1) System.out.println(n);
			n++;
		}

	}

}
