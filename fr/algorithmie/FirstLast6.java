package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		// Declare an integer array
		int[] array = {5, 2, 2};
		
//		Calculate a boolean value that is true if the array has at least one element and 
//		either the first or last element is 6, and is false otherwise 
		
		boolean isValid = array.length > 0 && (array[0] == 6 || array [array.length - 1] == 6) ? true : false;
		
		System.out.println(isValid);
	}

}
