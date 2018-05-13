package lab2;
import java.util.Scanner;
public class PowerTest {
	public static void main(String[] args){
		//create Scanner object
		Scanner user = new Scanner(System.in);
		
		//ask for input and account for invalid values
		System.out.println("Enter base number:");
		
		while(!user.hasNextInt()){
			System.out.println("Invalid input. Please try again: ");
			user.next();
		}
		
		int base = user.nextInt();
		
		System.out.println("Enter power:");
		
		while(!user.hasNextInt()){
			System.out.println("Invalid input. Please try again: ");
			user.next();
		}
		
		int power = user.nextInt();
		
		//create power objects
		Power1 p1 = new Power1();
		Power2 p2 = new Power2();
		System.out.println();
		
		//measure runtime of each object while calling them
		long start = System.nanoTime();
		double result = p1.rpow(base, power);
		long runtime = System.nanoTime() - start;
		
		System.out.println("For the 1st power function:");
		System.out.println("Result = " + result);		
		System.out.println("Runtime = " + runtime + " nanoseconds");
		
		System.out.println();
		
		start = System.nanoTime();
		result = p2.rpow2(base, power);
		long runtime2 = System.nanoTime() - start;
		
		System.out.println("For the 2nd power function:");
		System.out.println("Result = " + result);		
		System.out.println("Runtime = " + runtime2 + " nanoseconds");		
		System.out.println();
		
		//Compare and calculate time difference
		long difference = Math.abs(runtime - runtime2);
		System.out.println("The difference in runtime is: " + difference + " nanoseconds");
	}
}
