package Constructor;

public class Prog2 {
	static int c=20;
	
	Prog2(int a)
	{
		System.out.println("Constructor with parameter");
		System.out.println("Value of a = "+a);
		System.out.println("Value of d= "+c);
		c++;
	}

	public static void main(String[] args) {
		Prog2 b= new Prog2(15);	 // Object Created
		
		

	}

}
