package test;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Q3 {

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static double calc(String expression) {
    	ArrayList<String> tokens = getTokenArray(expression);
    	Queue output = shuntingYard(tokens);
    	Stack<String> calcStack = new Stack<String>();
    	while(!output.isEmpty())
    	{
    		String cur = output.poll().toString();
    		if(isNumeric(cur))
    		{
    			calcStack.push(cur);
    		}
    		else if(cur.equals("+"))
    		{
    			String operand2 = calcStack.pop();
    			String operand1 = calcStack.pop();
    			Expression exp = new Plus(new Number(Double.parseDouble(operand1)), new Number(Double.parseDouble(operand2)));
    			calcStack.push(String.valueOf(exp.calculate()));
    		}
    		else if(cur.equals("-"))
    		{
    			String operand2 = calcStack.pop();
    			String operand1 = calcStack.pop();
    			Expression exp = new Minus(new Number(Double.parseDouble(operand1)), new Number(Double.parseDouble(operand2)));
    			calcStack.push(String.valueOf(exp.calculate()));
    		}
    		else if(cur.equals("*"))
    		{
    			String operand2 = calcStack.pop();
    			String operand1 = calcStack.pop();
    			Expression exp = new Mul(new Number(Double.parseDouble(operand1)), new Number(Double.parseDouble(operand2)));
    			calcStack.push(String.valueOf(exp.calculate()));
    		}
    		else if(cur.equals("/"))
    		{
    			String operand2 = calcStack.pop();
    			String operand1 = calcStack.pop();
    			Expression exp = new Div(new Number(Double.parseDouble(operand1)), new Number(Double.parseDouble(operand2)));
    			calcStack.push(String.valueOf(exp.calculate()));
    		}
    	}
    	
    	return Double.parseDouble(calcStack.pop());
    }
    
    private static Queue shuntingYard (ArrayList<String> tokens){
    	Stack<String> operators = new Stack<String>();
    	Queue<String> output = new ArrayDeque<String>();
        
    	for(String token : tokens) {
    		if (isNumeric(token))
                output.add(token);
    		else if(token.equals("("))
    			operators.push(token);
    		else if(token.equals(")")){
    			while(!operators.isEmpty() && !operators.peek().equals("("))
    				output.add(operators.pop());
    			if(!operators.isEmpty())
    				operators.pop();
    		}
	        else{
	        	while (!operators.isEmpty() && isPrecedence(token,operators.peek()))
	        		output.add(operators.pop());
	        	operators.add(token);
	        }
		}

		while (!operators.isEmpty())
        {
            output.add(operators.pop());
        }
		
		return output;
    }
    // Creates a token array from a string
 	private static ArrayList<String> getTokenArray(String exp){
		String[] characters = exp.split("");
    	String tokenString = "";
    	ArrayList<String> tokens = new ArrayList<String>();
    	
    	// check every character to see if it's a symbol, set space between numbers, ebale 2 digit numbers
    	for (String character : characters) {
    		
    		//found a number or part of a number
    		if(isNumeric(character) || character.equals("."))
    			tokenString += character;
    		else
    			tokenString += " " + character + " ";
    	}
    	characters = tokenString.split(" ");
    	
    	for (String character: characters) {
    		if(!character.equals(" ") && !character.equals(""))
    			tokens.add(character);
		}
    	
    	return tokens;
    }
	// returns true when the string is not one of the operators we support
    private static boolean isNumeric(String s){
   	 return !(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("(") || s.equals(")") || s.equals(""));
	}
	//returns true when the weak operator only when the first operator is weaker then the second operator  
    private static boolean isPrecedence(String operator1 ,String operator2){
        return ((operator1.equals("-") || operator1.equals("+")) && (operator2.equals("/") || operator2.equals("*")));
    }
   
}