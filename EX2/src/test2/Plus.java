/**
 * 
 */
package test2;

/**
 * @author nimrodd
 *
 */
public class Plus extends BinaryExpression {

	/**
	 * @param left
	 * @param right
	 */
	public Plus(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculate() {
		return getLeft().calculate()-getRight().calculate();
	}


}