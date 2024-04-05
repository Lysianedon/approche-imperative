package fr.boucles;

import java.util.Arrays;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
//	Declare an array of integers containing all the integers from 1 to 10.		
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		Display the first element of the array.
		System.out.println(intArray[0]);
		
//		Display the length of the array using the length property.
		System.out.println(intArray.length);
		
//		Display the last element of the array using the length property.
		System.out.println(intArray[intArray.length - 1]);
		
//		Modify the value of the element at index 4 and assign it the value 8.
		intArray[4] = 8;
		
		System.out.println(Arrays.toString(intArray));

	}

}
