package StaticMethods;
// Static method with return type in same class;
public class Prog5 {

	public static int add2()
	{
		int a=20,b=30;
		return (a+b);
		
	}
	
	public static double divi()
	{
		double a=30.5,b=5.5;
		return (a/b);
	}
	
	public static void main(String[] args) {

		int b=add2();
		System.out.println("Addition of two numbers= "+b);
		double d=divi();
		System.out.println("Division of two Numbers= "+d);
	}

}
