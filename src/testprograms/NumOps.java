package testprograms

public class NumOps {
	
	private double number1, number2;
	
	public NumOps(double n1, double n2) {
		this.number1 = n1;
		this.number2 = n2;
	}
	
	public double add() {
		return this.number1+this.number2;
	}
	
	public double divide() {
		return this.number1/this.number2;
	}

}
