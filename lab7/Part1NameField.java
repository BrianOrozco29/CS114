package lab7;

import java.io.*;
import java.util.Scanner;

public class Part1NameField {

	 public static void main(String args[])
	    {
	        BufferedReader br = null;
	        String fileName = "employee.txt";
	        String line;
	        StaffMember staff = new StaffMember();
	        UALdictionary<String, StaffMember> uDict = new UALdictionary<String, StaffMember>();
	        try
	        {
	            br = new BufferedReader(new FileReader(fileName));
	            while((line = br.readLine()) != null)
	            {
	                String s = line, sp[];
	                sp = s.split(",");
	                staff.SetStaffMember(sp[0],sp[1],sp[2],sp[3],Double.parseDouble(sp[4]));
	                uDict.insert(sp[0], staff);
	            }
	        }
	        catch(Exception e)
	        {
	            System.out.println("File not found!");
	        }
	        System.out.println(uDict);

	        Scanner s = new Scanner(System.in);
	        while(true)
	        {
	            System.out.print("Enter name to remove from dictionary or \"exit\" to exit : ");
	            String name = s.nextLine();
	            if(name.equals("exit"))
	                break;

	            else
	            {
	                if((uDict.find(name)) == null)
	                {
	                    System.out.println("Element not in dictionary");
	                    continue;
	                }
	                uDict.remove(name);
	                System.out.println("Dictionary after removed element : " + uDict);
	            }

	            if(uDict.size() == 0)
	            {
	                System.out.println("Dictionary is now empty................");
	                break;
	            }
	        }

	        System.out.println("\nFinal dictionary after removed elements : " + uDict);
	    }

}
