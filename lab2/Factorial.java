package lab2;

public class Factorial {

	public static double formula(int n){
		//account for an input of 1, which would yield 1
		if(n==1 || n==0)
			return 1;
		
		//have method call itself to compute answer
		double answer = formula(n-1) * n;
		return answer;
	}
}
