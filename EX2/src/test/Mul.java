package test;

public class Mul extends BinaryExpression {

	public Mul(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public double calculate() {
		return Math.floor((getLeft().calculate()*getRight().calculate())*100)/100;
	}
}
