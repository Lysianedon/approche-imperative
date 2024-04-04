package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] cities = {"Paris", "Lyon", "Lille", "Barcelone", "Madrid"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println(cities[4]);
		System.out.println(cities.length);
		cities[3] = "Reims";
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println(cities[4]);
		

	}

}
