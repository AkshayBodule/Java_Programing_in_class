package Non_StaticMethods;
// Non Static method with parameter from same class...
public class Prog3 {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition= "+c);
	}
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction= "+c);
	}
	public void mul(double a,double b)
	{
		double c=a*b;
		System.out.println("Multiplication= "+c);
	}

	public static void main(String[] args) {
		Prog3 a= new Prog3();
		a.add(40,35);
		a.sub(60,30);
		a.mul(17,7);

	}

}
