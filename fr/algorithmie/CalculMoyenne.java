package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -28, 7, -1, 17, 2, 3, 0, 14, -4};
		
//		What is the average of the elements in the array?
		
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			
		}
		
		int average = sum / array.length;
		
		System.out.println("the average of the elements in the array is: " + average);

	}

}
