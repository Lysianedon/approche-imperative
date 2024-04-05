package fr.boucles;

import java.util.Iterator;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		int[] array = {15, -3, 0, 8, 7, 4, -28, 7, -1, 17, 2, 3, 0, 14, -4};
		
//		Display all the elements of the array using a loop.
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		Display all the elements in the reverse order of the array.
		for(int i = array.length; i > 0 ; i--) {
			System.out.println(array[i - 1]);
		}
//		Combine a loop and a test to display only the integers greater than 3
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 3) System.out.println(array[i]);
			
		}
//		Combine a loop and a test to display only the even integers.
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) System.out.println(array[i]);
			
		}
//		Combine a loop and a test to display values at even indexes.
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0) System.out.println(array[i]);
			
		}
//		Combine a loop and a test to display only the odd integers.
		for(int i = 0; i < array.length; i++) {
		if(array[i] % 2 == 1) System.out.println(array[i]);
		
	}
	}

}
