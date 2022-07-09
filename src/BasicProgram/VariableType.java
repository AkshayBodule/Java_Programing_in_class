package BasicProgram;

public class VariableType {
	
	static int a = 10; //Instance/ Global variable
	static int b = 20; //static variable

	public static void main(String[] args) {
		
		int c = 30; //Local variable
		final double interest_rate = 7.9; // variable
		System.out.println("Global Variable = " + a);
		System.out.println("Static Variable = " + b);
		System.out.println("Local Variable = " + c);
		System.out.println("Local Variable = " + interest_rate);
		a = 100;
		b = 200;
		c = 300;
		// d = 400;
		}


}
