package lab9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

public class Part2main {
	public static void main(String[] args) {
		 BufferedReader br = null;
	     String line;
	     PriorityQueue<String> q = new PriorityQueue<String>();
	     try{
	    	 br = new BufferedReader(new FileReader("patient.txt")); 
	    	 while((line = br.readLine()) != null){
		                String temp = line;
		                q.add(temp);
		                
		     }
	        }
	     catch(Exception e)
	        {
	            System.out.println("File not found");
	        }
	     
	     System.out.println(q);
}
}
