package Variable;

public class Prog1 {
	int a=10;				//Global /Instance variable
	static int b=20;		// Static variable
	public static void main(String[] args) {
		int c=30;		//Local / Temp. Variable
		final int d=40;
//		System.out.println("A = "+a);	//We can not use non static variable in static method
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		System.out.println("D = "+d);
		c=300;
		System.out.println("C = "+c);
//		d=200;		// Final variable value cannot change
		
		

	}

}
