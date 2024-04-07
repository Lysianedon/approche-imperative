package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		
		// Declare an integer array
		int[] array = {2, 1, 20};
//		Create a temp copy of last element;
		int lastInt = array[array.length - 1];
//		Perform a right rotation of the elements.
//		Example: if you have {0,1,2,3}, you get {3,0,1,2};
		
//		Copy the elements from the first to penultimate one and paste it at index 1 of array;
		System.arraycopy(array, 0, array, 1, array.length - 1);
//		Reassign first element;
		array[0] = lastInt;
		System.out.println(Arrays.toString(array));
		
		

	}

}
