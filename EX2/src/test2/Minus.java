/**
 * 
 */
package test2;

/**
 * @author nimrodd
 *
 */
public class Minus extends BinaryExpression {

	/**
	 * @param left
	 * @param right
	 */
	public Minus(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	public double calculate() {
		return getLeft().calculate()-getRight().calculate();
	}

}