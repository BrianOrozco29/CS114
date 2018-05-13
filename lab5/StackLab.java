package lab5;
import java.util.*;
import java.io.*;

public class StackLab {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		FileReader fr = new FileReader(new File("C:/Users/Brian/Documents/infix.dat"));
		BufferedReader br = new BufferedReader(fr);
		
		String fileLine = null;
		while((fileLine = br.readLine()) != null){
			System.out.println(fileLine);
			
			try{
				System.out.println(evalInf(fileLine));
			}
			catch(EmptyStackException emp){
				System.out.println("Invalid...");
			}
		}
	}
	
	public static int evalInf(String inf){
		char[] tokens = inf.toCharArray();
		
		Stack<Integer> operand = new Stack<Integer>();
		Stack<Character> operator = new Stack<Character>();
		
		for(int i = 0; i < tokens.length; i++){
			if(tokens[i] == ' ')
				continue;
			
			if(tokens[i] >= '0' && tokens[i] <='9'){
				
				StringBuffer buff = new StringBuffer();
				while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9'){
					buff.append(tokens[i++]);
					operand.push(Integer.parseInt(buff.toString()));
				}	
				
	 		}
			
			else if(tokens[i] == '(')
				operator.push(tokens[i]);
			
			else if(tokens[i] == ')'){
				while(operator.peek() != '('){
					operand.push(calculate(operator.pop(), operand.pop(), operand.pop()));
					operator.pop();
				}
				
			}
			
			else if(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/'){
				while(!operator.empty() && precedence(tokens[i], operator.peek())){
					operand.push(calculate(operator.pop(), operand.pop(), operand.pop()));
					
				}
				operator.push(tokens[i]);
			}
			
		}
		while (!operator.empty()){
			operand.push(calculate(operator.pop(),operand.pop(), operand.pop()));
		}
		return operand.pop();
	}
	
	public static boolean precedence(char operator1, char operator2){
		if (operator2 == '(' || operator2 == ')'){
			return false;
		}
		
		if ((operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-')){
			return false;
		}
		else{
			return true;
		}
			
	}
	public static int calculate(char operator, int operand1, int operand2){
		switch(operator){
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			if(operand2 == 0){
				throw new UnsupportedOperationException("Cannot divide by 0");
			}
			return operand1 / operand2;	
		}
		return 0;
	}
}
