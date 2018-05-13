package labs;
import java.util.Scanner;
public class SpeakerTest {
	public static void main(String[] args){
		//set up scanner
		Scanner user = new Scanner(System.in);
		
		//ask for input
		System.out.println("Enter the name of the bill.");
		String bill = user.nextLine();
		
		System.out.println("Enter the name of the sports team.");
		String sportsTeam = user.nextLine();
		
		System.out.println("Enter the name of the movie.");
		String movie = user.nextLine();
		
		//create objects
		SpeakerOfTheHouse obj1 = new SpeakerOfTheHouse();
		SportsAnnouncer obj2 = new SportsAnnouncer();
		Actor obj3 = new Actor();
		
		//call methods
		obj1.speak();
		obj1.announce(bill);
		
		obj2.speak();
		obj2.announce(sportsTeam);
		
		obj3.speak();
		obj3.announce(movie);
	}
}