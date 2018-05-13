package labs;
import java.util.Random;
public class TwoDArray {
	public static void main(String[] args){
		//declare the int array
		int[][] num = new int[2][10];
		
		//use nested loop to generate numbers into array
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 10; j++){
				num[i][j] = (int)(Math.random() * (1000-100)) + 100;
			}
		}
		//now use nested for loops to print array
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 10; j++){
				System.out.println(num[i][j]);
			}
		}
		
		System.out.println();
		
		//swapping rows
		int tempRow[] = num[0];
		num[0] = num[1];
		num[1] = tempRow;
		
		//print array again
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 10; j++){
				System.out.println(num[i][j]);
			}
		}
	}
}

