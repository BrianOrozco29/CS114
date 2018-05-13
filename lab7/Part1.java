package lab7;

import java.io.*;
import java.util.Scanner;

public class Part1 {

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
	                uDict.insert(sp[3], staff);
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
	            System.out.print("Enter SSN to remove from dictionary or \"exit\" to exit : ");
	            String ssnKey = s.nextLine();
	            if(ssnKey.equals("exit"))
	                break;

	            else
	            {
	                if((uDict.find(ssnKey)) == null)
	                {
	                    System.out.println("Element not in dictionary");
	                    continue;
	                }
	                uDict.remove(ssnKey);
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
