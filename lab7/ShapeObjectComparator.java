package lab7;
import java.util.Comparator;

public class ShapeObjectComparator implements Comparator<Shape>, java.io.Serializable 
{ 
    public int compare(Shape o1, Shape o2) 
    {   double per1 = o1.computePerimeter();   
        double per2 = o2.computePerimeter();   
        if (per1 < per2)      
            return -1;    
        else
        if (per1 == per2)      
            return 0;    
        else      
            return 1;  
    }
}
