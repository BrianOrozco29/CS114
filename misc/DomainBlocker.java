package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * A URL domain blocker.
 * 
 * @author Lewis and Chase
 * @version 4.0
 */
public class DomainBlocker
{
    private TreeSet<String> blockedSet;
    
    /**
     * Sets up the domain blocker by reading in the blocked domain names from
     * a file and storing them in a TreeSet.
     * @throws FileNotFoundException
     */
    public DomainBlocker() throws FileNotFoundException
    {
        blockedSet = new TreeSet<String>();
        
        //File inputFile = new File("blockedDomains.txt");
        File inputFile = new File("test.txt");
        Scanner scan = new Scanner(inputFile);
        
        while (scan.hasNextLine())
        {
            String s = scan.nextLine(), sp[];
            sp = s.split(",");
            blockedSet.add(sp[0]);  //will add the name to the TreeSet
        }
        
    }
    
    //Checks to see if the specified name is in the set.
    public boolean domainIsBlocked(String domain)
    {
        return blockedSet.contains(domain);
        
    }
}

