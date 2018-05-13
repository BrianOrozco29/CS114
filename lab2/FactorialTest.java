package lab2;
import java.util.Scanner;
public class FactorialTest {
	public static void main(String[] args){
		//establish scanner object
		Scanner user = new Scanner(System.in);
		//ask user to input int data
		System.out.println("Enter a number: ");
	
		
		//Asks user to resubmit input if input is invalid
		while(!user.hasNextInt()){
			System.out.println("Invalid input. Please try again: ");
			user.next();
		}
		
		//declare user input data
		int num = user.nextInt();
		
		//Create factorial object
		Factorial test = new Factorial();
		
		//Print the result
		System.out.println(num + "! is equal to " + test.formula(num));
	}
}
