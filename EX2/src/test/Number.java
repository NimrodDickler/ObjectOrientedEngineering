package test;

public class Number implements Expression {
	
	private double value;
	
    public Number(double num) {
        this.setValue(num);
    }
    
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	//@Override
	public double calculate() {
		return value;
	}
}
