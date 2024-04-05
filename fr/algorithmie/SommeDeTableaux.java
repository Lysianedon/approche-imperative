package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, -5, 9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		
//		Create an array that contains the sum of the elements of the previous two arrays.
		int maxLengthArray = Math.max(array1.length, array2.length);
		int[] sumOfArrays = new int[maxLengthArray];
		
		for(int i = 0; i < sumOfArrays.length; i++) {
			
			int val1 = i < array1.length ? array1[i] : 0;
			int val2 = i < array2.length ? array2[i] : 0;
			
			sumOfArrays[i] = val1 + val2;
		}
		
		System.out.println(Arrays.toString(sumOfArrays));
		
		
//		BONUS: Concatenate both arrays in a new array :
		int[] sumArrays = new int[array1.length + array2.length];

		
		for(int i = 0; i < array1.length; i++) {
			sumArrays[i] = array1[i];
			
		}
		for(int i = 0; i < array2.length; i++) {
			sumArrays[array1.length + i] = array2[i];
			
		}
//		System.out.println(Arrays.toString(sumArrays));
	}

}
