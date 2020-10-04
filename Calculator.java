import java.lang.*;
class Calculator {
	int num1, num2;
	public int add() {
		return num1 + num2;
	}
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.num1 = 10;
		c1.num2 = 20;
		System.out.println("Hello World! " + c1.add() + " is sum");
	}
}