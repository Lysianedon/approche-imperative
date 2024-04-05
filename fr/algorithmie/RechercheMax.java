package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -28, 7, -1, 17, 2, 3, 0, 14, -4};
//		Find the largest element in the array.
		int biggestInteger = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > biggestInteger) biggestInteger = array[i];
			
		}
		
		System.out.println("The biggest integer is: " + biggestInteger);
		
	}

}
