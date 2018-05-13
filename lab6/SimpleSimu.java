package lab6;

import java.util.Random;
import java.util.LinkedList;
public class SimpleSimu {
	public static void main(String[] args){
		final int MAX_NUM_CUSTOMERS = 5;
		final int MAX_CUST_SERVICED = 4;
		int numCust, ln, custServiced;
		int custCount = 0;
		int cycle = 0;
		
		Customer person;
		Random gen = new Random();
		Line line = new Line();
		
		numCust = gen.nextInt(MAX_NUM_CUSTOMERS);
		while(cycle<10){
			for (int i = 0; i < numCust; i++){
				person = new Customer(custCount++);
				line.addCustomer(person);
				ln = line.size() - 1;
				System.out.println(person + " joins the line. There are " + ln + " customers waiting.");
			}
			
			custServiced = gen.nextInt(MAX_CUST_SERVICED);
			
			for(int j = 0; j < custServiced; j++){
				if(line.isEmpty())
					System.out.println("Teller Waiting");
				else
					System.out.println(line.nextCustomer() + " is being serviced");
			}
			System.out.println();
			System.out.println("-----New Cycle-----");
			System.out.println();
			cycle++;
		}
	}
    
}
