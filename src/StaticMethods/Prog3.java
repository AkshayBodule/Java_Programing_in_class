package StaticMethods;
// Static method with parameter from same class ;
public class Prog3 {

	public static void add1(int a)
	{
		int sum=a+a;
		System.out.println("ADDITION= "+sum);
	}
	
	public static void mul(int a,int b)
	{
		System.out.println("MULTI= "+(a*b));
	}
	public static void div(double a,double b)
	{
		double d=a/b;
		System.out.println("DIVISION= "+d);
	}
	
	public static void main(String[] args) {
		add1(10);
		mul(12,10);
		div(10,12);

	}

}
