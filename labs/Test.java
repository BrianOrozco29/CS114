package labs;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//Create character string array and establish Novel Object
		String[] wizards = {"Harry Potter", "Hermione Granger", "Ronald Weasley", "Voldemort"};
		Novel harryPotter = new Novel(wizards, "Harry Potter", "JK Rowling", 303);
		
		//Establish GraphicNovel object
		String[] heroes = {"Iron Man", "Captain America", "Black Widow", "The Hulk", "Thor"};
		GraphicNovel avengers = new GraphicNovel(heroes, "Avengers", "Jack Kirby", "Stan Lee", 50);
		
		//Establish Article object
		Article pc = new Article("Anthropological Quarterly", "The Social Meaning of the Personal Computer", "Bryan Pfaffenberger", 10);
		
		//Summaries
		harryPotter.summary();
		System.out.println(harryPotter.isLong());
		System.out.println();
		
		System.out.println(Arrays.toString(heroes));
		avengers.summary();
		System.out.println();
		
		System.out.println(pc.isLong());
		pc.summary();
	}
}