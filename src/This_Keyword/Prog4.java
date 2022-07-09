package This_Keyword;

public class Prog4 {

	Prog4()
	{
		this(22);	// if we have to Print Parameter constructor then we use "this(value)" keyword..
		System.out.println("Zero Constructor");
		
	}
	Prog4(int a)
	{
		System.out.println("Value of A = "+a);
	}
	public static void main(String[] args) {
	Prog4 x = new Prog4();

	}

}
