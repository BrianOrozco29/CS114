package lab9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Part1main {

	public static void main(String[] args) {
		 BufferedReader br = null;
	     String line;
	     String[] q = new String[23];
	     try{
	    	 br = new BufferedReader(new FileReader("inventory.txt")); 
	    	 int i = 0;
	    	 while((line = br.readLine()) != null){
		                String temp = line;
		                q[i]=temp;
		                i++;
		     }
	        }
	     catch(Exception e)
	        {
	            System.out.println("File not found");
	        }
	      System.out.println(q);
	      MaxHeap heap = new MaxHeap(q, q.length, q.length);
	      System.out.println(heap);
	}

}
