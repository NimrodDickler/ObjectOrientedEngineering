/**
 * 
 */
package test;

/**
 * @author nimrodd
 *
 */
public class Main {
	public static void main(String[] args) {
		
		// Q1 Tests
		System.out.print("Q1: \n");
		Expression expPlus = new Plus(new Number(4),new Number(3));
		int exprectedPlus = 7;
		if(expPlus.calculate() == exprectedPlus)
			System.out.print("Plus is OK\n");
		
		Expression expMinus = new Minus(new Number(4),new Number(3));
		int exprectedMinus = 1;
		if(expMinus.calculate() == exprectedMinus)
			System.out.print("Minus is OK\n");
		
		Expression expMul = new Mul(new Number(4),new Number(3));
		int exprectedMul = 12;
		if(expMul.calculate() == exprectedMul)
			System.out.print("Mul is OK\n");
		
		Expression expDiv = new Div(new Number(4),new Number(4));
		int exprectedDiv = 1;
		if(expDiv.calculate() == exprectedDiv)
			System.out.print("Div is OK\n");
		
		Expression exp = new Plus(new Number(4),new Number(4));
		System.out.print("\n1.Calculate expression: "+ exp.calculate());
		Expression exp2=new Plus(new Div(new Number(10),new Number(2)), new Mul(new Number(1), new Minus(new Number(3),new Number(4))));
		System.out.print("\n2.Calculate expression: "+ exp2.calculate());
		Expression exp3 = new Div(new Number(4),new Number(3));
        System.out.print("\n3.Calculate expression: "+ exp3.calculate());
        
     // Q2 Tests
		int exprectedQ2 = 3;
		if(Q2.calc() == exprectedQ2)
			System.out.print("\n\nQ2: \nQ2 is OK\n");
		
     // Q3 Tests
	
	 // Ruslans tests 

		String exptest1 = "3+5";
		double expresult1 = 8.0;
		if(Q3.calc(exptest1) != expresult1)			
			System.out.print("\nProblem with:" + exptest1);

		String exptest2 = "3.5+5.5";
		double expresult2 = 9.0;
		if(Q3.calc(exptest2) != expresult2)			
			System.out.print("\nProblem with:" + exptest2);
		
		String exptest3 = "(3+5)*4-12";
		double expresult3 =20.0;
		double a = Q3.calc(exptest3);

		String exptest4 = "1-1-1";
		double expresult4 =15.0;
		double b = Q3.calc(exptest4);
		System.out.print(Q3.calc(exptest4));
	
		String exptest777 = "3+5*4-12";
		double expresult777 =11.0;
		if(Q3.calc(exptest777) != expresult777)			
			System.out.print("\nProblem with:" + exptest777);
		
		String exptest5 = "7.5*(4.3+(6-12.3))/(0-3.0)";
		double expresult5 =5.00;
		if(Q3.calc(exptest5) != expresult5)			
			System.out.print("\nProblem with:" + exptest5 + "The results is: " + Q3.calc(exptest5));
		
		//Elis tests
		String exptest6 = "3+3";
		double expresult6 =6;
		if(Q3.calc(exptest6) != expresult6)			
			System.out.print("\nProblem with:" + exptest6);
		
		String exptest7 = "3+3";
		double expresult7 =6;
		if(Q3.calc(exptest7) != expresult7)			
			System.out.print("\nProblem with:" + exptest7);

		String exptest8 = "3.4+6.6";
		double expresult8 = 10;
		if(Q3.calc(exptest8) != expresult8)			
			System.out.print("\nProblem with:" + exptest8);
		
		String exptest9 = "(3+5)*4-12+1";
		double expresult9 = 21;
		if(Q3.calc(exptest9) != expresult9)	{		
			System.out.print("\nProblem with:" + exptest9);
			System.out.print("\nThe Result is:" + Q3.calc(exptest9) + ", Expected:" + expresult9 );
		}
		
		String exptest10 = "3+5*4-12-1";
		double expresult10 = 10;
		if(Q3.calc(exptest10) != expresult10)			
			System.out.print("\nProblem with:" + exptest10);
		
		String exptest11 = "7.5*(4.3+(6-12.3))/(0-3.0)";
		double expresult11 = 5;
		if(Q3.calc(exptest11) != expresult11)			
			System.out.print("\nProblem with:" + exptest11);
		
		String exptest12 = "3+5";
		double expresult12 = 8;
		if(Q3.calc(exptest12) != expresult12)			
			System.out.print("\nProblem with:" + exptest12);
		
		String exptest13 = "3.5+5.5";
		double expresult13 = 9;
		if(Q3.calc(exptest13) != expresult13)			
			System.out.print("\nProblem with:" + exptest13);
		
		String exptest14 = "(3+5)*4-12";
		double expresult14 = 20;
		if(Q3.calc(exptest14) != expresult14)			
			System.out.print("\nProblem with:" + exptest14);
		
		String exptest15 = "7.5*(4.3+(6-12.3))/(0-3.0)";
		double expresult15 = 5;
		if(Q3.calc(exptest15) != expresult15)			
			System.out.print("\nProblem with:" + exptest15);
	}
}