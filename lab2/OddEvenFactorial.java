package lab2;
import java.util.Scanner;
public class OddEvenFactorial {
	
	//create odd/even method
	public static long oddEvenFact(int n){
		//multiply input by every odd/even value before it
		if (n > 2)
			return oddEvenFact(n-2) * (long) n;
		else
			return (long) n;
	}
	
	public static void main(String[] args) {
		//establish and request user input
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		while(!user.hasNextInt()){
			System.out.println("Invalid input. Please try again: ");
			user.next();
		}
		int num = user.nextInt();
		
		//call oddEven method and print result
		long result = oddEvenFact(num);
		System.out.println("The odd/even factorial of " + num + " is equal to " + result);
	}

}
