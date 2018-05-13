package labs;
import java.util.Random;
public class RandUp {

	public static void main(String[] args) {
		//make random object
		Random rn = new Random();
		
		//make empty string to concatenate later
		String randUpper = "";
		//establish Alphabet to choose randomly
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//use for loop to choose a random letter and concatenate
		for(int i = 0; i < 8; i++){
			char upper = alphabet.charAt(rn.nextInt(alphabet.length()));
			randUpper = randUpper + upper;
		}
		
		//Finally print result
		System.out.println(randUpper);
	}

}
