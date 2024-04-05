package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -28, 7, -1, 17, 2, 3, 0, 14, -4};
		
//		Display all the elements of the array using a loop.
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
//		Display all the elements in the reverse order of the array.
		for(int i = array.length; i > 0 ; i--) {
			System.out.println(array[i - 1]);
		}
		
//		Create an array arrayCopy and copy all elements from array into arrayCopy.
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(arrayCopy));
		
		
		
	}
}
