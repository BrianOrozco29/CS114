package labs;

public class SpeakerOfTheHouse implements Speaker{

	public void speak() {
		System.out.println("I am the Speaker of the House.");
	}

	public void announce(String str) {
		System.out.println("The bill, " + str + ", has passed!");
		
	}
	
}
