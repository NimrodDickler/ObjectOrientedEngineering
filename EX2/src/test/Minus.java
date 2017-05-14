package test;

public class Minus extends BinaryExpression {

	public Minus(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public double calculate() {
		return Math.floor((getLeft().calculate()-getRight().calculate())*1000)/1000;
	}
}
