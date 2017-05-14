package test2;

abstract class BinaryExpression implements Expression {
	//Variables 
	private Expression left;
	private Expression right;
	
	//Methods 
	
	//Constructor
    public BinaryExpression(Expression left, Expression right) {
        this.setLeft(left);
        this.setRight(right);
    }
	
	public Expression getLeft() {
		return left;
	}

	public void setLeft(Expression left) {
		this.left = left;
	}

	public Expression getRight() {
		return right;
	}

	public void setRight(Expression right) {
		this.right = right;
	}
	
	@Override
	public double calculate() {
		return 0;
	}
}
