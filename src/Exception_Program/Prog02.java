package Exception_Program;

public class Prog02 {

	public static void main(String[] args) throws ArithmeticException {
		int a=10,b=2,c;
		c=a/b;
		
		System.out.println("Main Start");
		System.out.println(c);
		throw new ArithmeticException();
	//	System.out.println("Main End");
	}

}
