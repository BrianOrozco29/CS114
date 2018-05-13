package lab3;
import java.util.*;

public class EmployeeMain {

	public static void main(String args[])
    {
        
        Staff obj = new Staff();
        ArrayList<StaffMember> empList = new ArrayList<StaffMember>();
        for(int start= 0; start <obj.getSize(); start++)
        {
        	empList.add(obj.getStaff(start));
        }

        //i
        for(int x = 0; x<empList.size(); x++)
        {
            System.out.println(empList.get(x));
            if(empList.get(x) instanceof Executive)
                System.out.println("Executive");
            else if(empList.get(x) instanceof Hourly)
                System.out.println("Hourly");
            else if(empList.get(x) instanceof Employee)
                System.out.println("Employee");
            else if(empList.get(x) instanceof Volunteer)
                System.out.println("Volunteer");
            System.out.println("Pay : " + obj.getStaff(x).pay());
            System.out.println("");
        }

        //ii
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        
        String y = "loop";
        while(y.equals("loop"))
        {
            System.out.print("Enter the name of the employee to remove from list or exit to exit : ");
            String input = s.next();
            if(input.equals("exit"))
                y = "exit";
            else
            {
                int check = 1;
                for(int z = 0; z < empList.size(); z++)
                {
                    if(input.equals(empList.get(z).name))
                    {
                        check = 1;
                        if(empList.get(z) instanceof Executive)
                        {
                            System.out.println("***************** An Executive cannot be deleted!***************** ");
                            break;
                        }
                        else
                        {
                        	empList.remove(z);
                            if(empList.size() == 1)
                            {
                                y = "exit";
                                System.out.println("The list is empty already!");
                            }
                            break;
                        }
                    }
                    else
                        check = 0;
                }
                if(check == 0)
                    System.out.println(input + " not found!"); 
            }
            System.out.println("***************** This is the updated list *************");
            System.out.println(empList + "\n");
        }

        //iii
        
        String out = "loop";
        String newAddress;
        while(out.equals("loop"))
        {
            System.out.print("Enter the name of the employee to update address or exit to exit : ");
            String input2 = s.next();

            int check2 = 1;
            if(input2.equals("exit"))
                out = "exit";
            else
            {
                for(int z2 = 0; z2 < empList.size(); z2++)
                {
                    if(input2.equals(empList.get(z2).name))
                    {
                        check2 = 1;
                        System.out.print("Enter the new address to be replaced for " + input2 + " : ");
                        newAddress = s2.nextLine();
                        empList.get(z2).address = newAddress;
                        break;
                    }
                    else
                        check2 = 0;
                }
            }
            if(check2 == 0)
                System.out.println(input2 + " not found!");
            System.out.println("");
            System.out.println("***************** New List *************");
            System.out.println(empList + "\n");
        }
        
        System.out.println("***************** final list *************");
        
        for(int h = 0; h <empList.size(); h++)
        {
            System.out.println(empList.get(h));
            if(empList.get(h) instanceof Executive)
                System.out.println("Executive");
            else if(empList.get(h) instanceof Hourly)
                System.out.println("Hourly");
            else if(empList.get(h) instanceof Employee)
                System.out.println("Employee");
            else if(empList.get(h) instanceof Volunteer)
                System.out.println("Volunteer");
            System.out.println("Pay : " + obj.getStaff(h).pay());
            System.out.println("");
        }
    }

}
