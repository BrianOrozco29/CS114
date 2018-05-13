package lab6;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;


public class TicketCounter {
	public static void main(String[] args) {
       TicketBuyer customer;
       Queue<TicketBuyer> tb = new LinkedList<TicketBuyer>();
       int [] cashinerTimer = new int [10];
       int totalTime = 0;
       int avg;
       int leave;
       int start;
		      
	   for (int cashier = 0; cashier < cashinerTimer.length; cashier++)
	   {
	       for (int count = 0; count < cashier; count++)
	       {
	           cashinerTimer[count] = 0;
	       }
	      
	       for(int count = 1; count < 10; count++)
	       {
	           tb.add(new TicketBuyer(count * 15));
	           totalTime = 0;
	       }
		          
       while (!(tb.isEmpty()))
       {
           for(int count = 0; count <= cashier; count++)
           {
               if(!(tb.isEmpty()))
               {
                   customer = tb.remove();
                   if(TicketBuyer.getArrivalTime() > cashinerTimer[count]){
                       start = TicketBuyer.getArrivalTime();
                   }
                   else 
                   {
                       start = cashinerTimer[count];
                   }              
                   leave = start + 120;
                   TicketBuyer.setDepartureTime(leave);
                   cashinerTimer[count] = leave;
                   totalTime += TicketBuyer.totalTime();
               }
           }
       }
       
       avg = totalTime / 10;
       System.out.println("# of cashiers: " +(cashier + 1));
       System.out.println("Average time: " + avg);
       System.out.println();
       
       }
	}   

}
