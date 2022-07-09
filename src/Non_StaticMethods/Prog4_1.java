package Non_StaticMethods;
// Non Static method with parameter from different class...
public class Prog4_1 {

	public void div(double a,double b)
	{
		double t=a/b;
		System.out.println("Division= "+t);
	}
	
	public void mul(int a,int b)
	{
		int t=a*b;
		System.out.println("Multiplication= "+t);
	}
	
	public void temp(int c)
	{
		double f;
		System.out.println("Temperature in Celcius= "+c);
		f=(c*(9/5.0)+32);
		System.out.println("Temperature in Fahrenheit= "+f);
	}
}
