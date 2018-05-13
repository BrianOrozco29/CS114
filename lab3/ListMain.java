package lab3;
import java.util.*;
public class ListMain {
	public static void main(String[] args){
		Scanner user = new Scanner(System.in);
		
		AList<Integer> list1 = new AList<Integer>();
		int[] a = {11,4,15,20};
		
		//i
		for (int i = 0; i < a.length; i++){
			list1.append(a[i]);
		}
		System.out.println(list1);
		
		
		//ii
		int[] b = {9,3,7,22,13};
		for(int i = 0; i < b.length; i++){
			list1.moveToPos(2 + i);
			list1.insert(b[i]);
		}
		//iii
		System.out.println(list1);
		
		//iv
        int y = 1;
        boolean check = false;
        while(y == 1) 
        {
            int x = 1;
            int num = 1;
            while(x == 1) 
            {
                try
                {
                    System.out.print("Enter a number to remove from list or 0 to exit : ");
                    num = user.nextInt();
                    if(num >= 0)
                        x = 2;
                    else
                        System.out.println("Opps!, that is not a valid input. Try again!\n"); 
                }
                catch(Exception e)
                {
                    System.out.println("Opps!, that is not a valid input. Try again!\n");
                    user.next();
                }
            }
            
            if(num != 0)
            {
                list1.moveToStart();
                for(int start = 0; start < list1.length(); start++)
                {
                	list1.moveToPos(start);
                    if(num == (int)list1.getValue())
                    {
                    	list1.remove();
                        System.out.println("This is the list : " + list1 + "\nThe length is : " + list1.length());
                        check = false;
                        break;
                    }
                    else
                        check = true;
                }
            }
            
            if((list1.length() == 0) || num == 0)
            {
                y = 0;
            }
            
            if(check == true)
            {
                System.out.println("That number isn't in the list...try again!");
            } 
            
            System.out.println("");
            
            //v
            int input;
            int terminated = 1;
            while(terminated == 1)
            {
                System.out.print("Enter a number to add to list or 0 to exit : ");
                input = user.nextInt();
                if(list1.length()!= list1.getMaxSize() && input != 0)
                {
                    if(list1.length() == 0)
                    	list1.append((int)input);
                    else
                    	list1.insert((int)input);
                    
                    System.out.println(list1);
                }
                else if(list1.length()== list1.getMaxSize() || input == 0)
                    terminated = 0;
            }
            
        }
        }
	}

