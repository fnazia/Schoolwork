package testprograms;

public class NumOpsFixture {
	
	private double num1, num2;
	
	public void setNumber1(double number1) {
		this.num1 = number1;
	}
	
	public void setNumber2(double number2) {
		this.num2 = number2;
	}
	
	public double addResult() {
		NumOps testInstance = new NumOps(num1, num2);
		return testInstance.add();
	}
	
	public double divideResult() {
		NumOps testInstance = new NumOps(num1, num2);
		return testInstance.divide();
	}

}
