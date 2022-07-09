package Exception_Program;
// try-catch
public class Prog01 {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		int a=10,b=0,c;
		
		try {
		c=a/b;					// Risky Code
		System.out.println("Total = "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Handle = "+ae);
		}
		System.out.println("Main End");

		
	}

}
