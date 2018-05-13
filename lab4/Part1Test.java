package lab4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Part1Test 
{
	public static void main(String args[]) throws FileNotFoundException
	{
// part 1 a
		
		LList a1 = new LList();
	
		BufferedReader input; 
		
		File file = new File("C:/Users/Brian/Documents/gamescore.txt");
		
		//System.out.println(file.exists());
		
		//System.out.println(new File(".").getAbsoluteFile());
		//reads file and adds data to the list
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line = br.readLine(); line != null; line = br.readLine()) {
				a1.append(line);
			}
        }
		//input is invalid and lets user try again
		catch(Exception e){
            System.out.println("File not found");
        }
		
        final int arrySize =a1.length();
        System.out.println(a1);
        
        //part 1 b - remove function
	
        Scanner s1 = new Scanner(System.in);
       //user can enter a name,score to remove from list 
        while(true){
        	System.out.println("Enter 'name,score' to REMOVE from the game (i.e. Mike,1105) or enter 'Exit' to exit:  ");
        	
        	String input1 = null;
        	
        	try{
        		input1 = s1.nextLine();
        	}
        	catch(Exception e){
        		System.out.println("Enter a valid name. or 'Exit' to exit:  ");
        		
        	}
        	//to exit the remove function
        	a1.moveToStart();
        	if(input1.equalsIgnoreCase("Exit")||input1.equalsIgnoreCase("exit"))
        	{
        		break;
        	}
        	else
        	{
        		for(int x = 0; x< a1.length();x++)
        		{
        			if(a1.getValue().equals(input1)){
        				a1.remove();
        				System.out.println(input1 + " has been removed from the gamescore.");
        				break;
        			}
        			else if(x == a1.length()-1){
        				System.out.println("Name not found.");
        			}
        			a1.next();
        		}
        	}
        	System.out.println(a1);
        }
	
		//Part 1 b - add function
	System.out.println();
	
        while(true){
        	//lets user enter a name,score to add
        	Scanner s2 = new Scanner(System.in);
        	System.out.println("Enter a name,score you would like to ADD to the gamescore. (or enter 'Exit' to exit.");
        	
        	String input2 = null;
        	
        	try{
        		input2 = s2.nextLine();
        	}
        
        	catch(Exception e){
        		System.out.println("Enter a valid name to enter or 'Exit' to exit.");
        	}
        	if(input2.equalsIgnoreCase("Exit")||input2.equalsIgnoreCase("exit")|| a1.length()==arrySize){
        		break;
        	}
        	else{
        		a1.moveToStart();
        		//If user enters an existing name,score
        		for( int x = 0; x < a1.length(); x++){
        			if(a1.getValue().equals(input2)){
        				System.out.println("Name is already in gamescore. Try adding another name.");
        				break;
        			}
        		}
        		a1.moveToStart();
        		a1.insert(input2);
        	}
        	System.out.println(a1);
        }
		
        System.out.println();
        System.out.println("Current GameScore: ");
        System.out.println(a1);
        
        System.out.println("After Reversal: ");
        a1.reverse();
        System.out.println(a1);
		     
//main()end	
	}
//class end
}
//end of driver
