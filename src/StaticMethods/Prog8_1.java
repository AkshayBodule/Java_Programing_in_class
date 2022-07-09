package StaticMethods;

public class Prog8_1 {

	public static double diameter()
	{
		double i=2.5,r;
		r=i*i;
		return r;
	}
	
	public static double area()
	{
		double i=2.5,r;
		r=3.1415*i*i;
		return r;
	}
	
	public static int add()
	{
		int i=10;
		return (i+i+i+i);
	}
	
	public static char ch()
	{
		char c='A';
		return c;
	}
	
	public static String st()
	{
		String s="this is static method of returntype for differnt class....";
		return s;
	}
}
