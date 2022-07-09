package Constructor;

public class Prog3_both_Constructor {

	Prog3_both_Constructor()
	{
		System.out.println("Constructor without Parameter");
	}
	Prog3_both_Constructor(int a)
	{
		System.out.println("Constructor with parameter");
		System.out.println("A = "+a);
	}
	Prog3_both_Constructor(int a,int b)
	{
		System.out.println("A = "+a+ "\t"+"B = "+b);
	}
	
	public static void main(String[] args) {

		Prog3_both_Constructor x= new Prog3_both_Constructor();
		Prog3_both_Constructor y=new Prog3_both_Constructor(10);
		Prog3_both_Constructor z=new Prog3_both_Constructor(22,55);
	}

}
