package misc;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Domain checking driver.
 * 
 * @author Lewis and Chase
 * @version 4.0
 */
public class DomainChecker
{
    /**
     * Repeatedly reads a domain interactively from the user and checks to
     * see if that domain has been blocked.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("********************************* Exercise 3 *********************************");
        DomainBlocker blocker = new DomainBlocker();
        Scanner scan = new Scanner(System.in);

        String domain;
        /*
        do
        {
            System.out.print("Enter a domain (DONE to quit): ");
            domain = scan.nextLine();

            if (!domain.equalsIgnoreCase("DONE"))
            {
                if (blocker.domainIsBlocked(domain))
                    System.out.println("That domain is blocked.");
                else
                    System.out.println("That domain is fine.");
            }
        } while (!domain.equalsIgnoreCase("DONE"));*/
        
        //Exercise 3
        do
        {
            System.out.print("Enter a name (DONE to quit): ");
            domain = scan.nextLine();

            if (!domain.equalsIgnoreCase("DONE"))
            {
                if (blocker.domainIsBlocked(domain))
                    System.out.println("That name is in the set.");
                else
                    System.out.println("That name is not in the set");
            }
        } while (!domain.equalsIgnoreCase("DONE"));
    }
}