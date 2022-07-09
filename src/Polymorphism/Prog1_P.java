package Polymorphism;
//// compiler run time.... Method overloading...
public class Prog1_P {

	public void add()
	{
		System.out.println("Zero Parameter ");
	}
	
	public void add(int a)
	{
		System.out.println("Addition using one int = "+(a+a));
	}
	public void add(int a, int b)
	{
		System.out.println("Addition using two int = "+(a+b));
	}
	public void add(double a)
	{
		System.out.println("Addition using one double = "+(a+a));
	}
	public void add(double a, double b)
	{
		System.out.println("Addition using two double = "+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition using three int = "+(a+b+c));
	}
}
