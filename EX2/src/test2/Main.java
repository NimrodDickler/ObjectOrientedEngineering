package test2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String srt_exp = "1+2";
		
	    Expression e2=new Plus(new Div(new Number(10),new Number(2)), new Mul(new Number(1), new Min(new Number(3),new Number(4))));
        System.out.print("This is my test2----> "+e2.calculate());

	}

}
