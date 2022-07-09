package This_Keyword;

public class Prog3 {

	Prog3()
	{
		System.out.println("Constructor without Parameter or Zero Constructor");
	}
	
	Prog3(int a)
	{
		this();			// if we have to Print zero constructor then we use "this()" keyword..
		System.out.println("Value of A = "+a);
	}
	public static void main(String[] args) {
		Prog3 x= new Prog3(10);
		

	}

}
