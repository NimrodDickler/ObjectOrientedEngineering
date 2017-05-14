/**
 * 
 */
package test2;

/**
 * @author nimrodd
 *
 */
public class Mul extends BinaryExpression {
	
	// Methods
	
	public Mul(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public double calculate() {
		return getLeft().calculate()*getRight().calculate();
	}


}
