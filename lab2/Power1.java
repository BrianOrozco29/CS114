package lab2;

public class Power1 {
	//1st power function discussed in class
	double rpow(int x, int n) {
		if (n == 0)
			return 1.0;
		return x * rpow(x, n - 1);
	}

}
