package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		// Declare an integer array
		int[] array = {2, 1, 20};
		
//		Calculate a boolean value that:
//			is true if the array's length is 1 or more and the first and last elements are the same.
//			is false otherwise.
		
		boolean isArrayValid = array.length > 0 && (array[0] == array[array.length - 1]) ? true : false;
		
		System.out.println(isArrayValid);

	}

}
