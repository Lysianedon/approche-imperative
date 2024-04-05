package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -28, 7, -1, 17, 2, 3, 0, 14, -4};
//		Create an array arrayCopy and copy all the elements from array into arrayCopy in reverse order.
		int[] arrayCopy = new int [array.length];
		
		for(int i = array.length; i > 0; i--) {	
			arrayCopy[i - 1] = array[array.length - i];
		}	
		
		//OR:
		for(int i = 0; i < array.length; i++) {	
			arrayCopy[i] = array[array.length - i - 1];
		}
//		Display all the elements of both arrays.
		System.out.println("Array:" + Arrays.toString(array));
		System.out.println("ArrayCopy:" + Arrays.toString(arrayCopy));
		
	}

}
