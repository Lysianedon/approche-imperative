package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -28, 7, -1, 17, 2, 3, 0, 14, -4};;
//		Find the largest element in the array.
		int smallestInteger = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] < smallestInteger) smallestInteger = array[i];
			
		}
		
		System.out.println("The smallest integer is: " + smallestInteger);
		
	}

}
