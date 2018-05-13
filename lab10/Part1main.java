package lab10;

import java.io.*;
import java.util.*;

public class Part1main {
	  public static void main(String a[]){
		  Map<String, Integer> occurrences = new HashMap<String, Integer>();
		  BufferedReader br = null;
		     String line;
		     String[] q = new String[23];
		     try{
		    	 br = new BufferedReader(new FileReader("document.txt")); 
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
		  for ( String word : q ) {
		     Integer oldCount = occurrences.get(word);
		     if ( oldCount == null ) {
		        oldCount = 0;
		     }
		     occurrences.put(word, oldCount + 1);
		  }
	    }
	  	
}
