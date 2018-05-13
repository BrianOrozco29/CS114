package lab7;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class VerifyTest
{
 
    public static void main(String[] args) throws FileNotFoundException
    {

    	StaffEmployee ver = new StaffEmployee();
        Scanner scan = new Scanner(System.in);

        String line;
 
        do
        {
            System.out.print("Enter a name (DONE to quit): ");
            line = scan.nextLine();

            if (!line.equalsIgnoreCase("DONE"))
            {
                if (ver.employeeIsverified(line))
                    System.out.println("That name is verified.");
                else
                    System.out.println("That name is not verified.");
            }
        } while (!line.equalsIgnoreCase("DONE"));
    }
}
