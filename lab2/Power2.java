package lab2;

public class Power2 {
	//2nd recursive function discussed in class
	double rpow2(int x, int n)  // x is the base and n is the exponent
	{
	    if (n == 0)                          // n = 0 is base part of recursive
	       return 1.0;
	       if (n % 2 == 1) // n is odd
	      {
	         double y = rpow2(x, (n - 1) / 2);
	         return x * y * y;
	       } else 
	         {
	              double y = rpow2(x, n / 2);
	              return y * y;
	          }
	 }

}
