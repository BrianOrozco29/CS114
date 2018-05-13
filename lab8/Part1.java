package lab8;

import java.io.*;
import java.util.Scanner;
public class Part1
{
    public static void main(String args[])
    {
      
        BufferedReader br = null;
        String line;
        BST<String, String> bin = new BST<String, String>();
        BSTNode<String, String> binNode = new BSTNode<String, String>();
        try{
            br = new BufferedReader(new FileReader("inventory.txt"));
            while((line = br.readLine()) != null)
            {
                String temp = line;
                bin.insert(temp, temp);
            }
        }
        catch(Exception e)
        {
            System.out.println("File not found");
        }
        System.out.println(bin);
        
        
        
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a parts number to insert or \"exit\" to exit: ");
            String node = s.next();
            
            if(node.equals("exit"))
                break;
            
            System.out.println(bin.find(node));
            bin.insert(node, node);
            System.out.println("PreOrder : " + bin.toString());
            System.out.println("PostOrder : " + bin.toString());
            System.out.println("InOrder : " + bin.toString());
            
            System.out.println("\n");
        }
        
        
       
        while(true)
        {
            System.out.println("Enter a parts number to delete or \"exit\" to exit: ");
            String node = s.next();
            
            if(node.equals("exit"))
                break;
            bin.remove(node);
            System.out.println("PreOrder : " + bin.toString());
            System.out.println("PostOrder : " + bin.toString());
            System.out.println("InOrder : " + bin.toString());
            
            System.out.println("\n");
            
            if(bin.size() == 0)
            {
                System.out.println("Tree is empty........");
                break;
            }
        }
        
        while(true)
        {
            System.out.print("Enter the range or \"exit\": ");
            String input = s.next();
            if(input.equals("exit"))
                break;
            bin.printRang(bin.getRoot(), s.next(), s.next());
            System.out.println(bin);
        }

    }
}

