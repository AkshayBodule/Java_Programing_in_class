package Non_StaticMethods;
// Static method and non-static method call from same and different class with parameter, without parameter and return type
public class Prog7_1_all_Steps {

	public static void name()
	{
		System.out.println("Static Method call From Same Class...");
	}
	
	public static void name1()
	{
		System.out.println("Static Method call From Different Class");
	}
	
	public void name2()
	{
		System.out.println("Non-Static Method call from Same Class");
	}
	
	public void name3()
	{
		System.out.println("NON Static Method call From Different Class");
	}
	
	public static void add(int a,int b)
	{
		System.out.println("Static method call parameter from same class");
		int c=a+b;
		System.out.println("Total= "+c);
	}
	
	public static void add1(int a,int b,int c)
	{
		System.out.println("Static Method call parameter from Different Class");
		int d=a+b+c;
		System.out.println("Total= "+d);
	}
	
	public void add2(int a,int b)
	{
		int c=a+b;
		System.out.println("Non Static Method parameter from Same class");
		System.out.println("Total= "+c);
	}
	
	public void add3(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Non Static Method Parameter from Differnt Class");
		System.out.println("Total = "+d);
	}
	
	public static int sub()
	{
		int a=50,b=30,c;
		c=a-b;
	//	System.out.println("Static Method return type from same Class");
		return c;
	}
	
	public static int sub1()
	{
		int a=90,b=45,d;
		d=a-b;
	//	System.out.println("Static Method return type From Different Class");
		return d;
		
	}
	 
	public int sub2()
	{
		// Non static Method return type from same Class..
		int a=90,b=25,c;
		c=a-b;
		return c;
	}
	
	public int sub3()
	{
		//Non static Method return type from different Class...
		int a=540,b=263;
		int c=a-b;
		return c;
	}
	
	public static double div(double a,double b)
	{
		// Static Method Return type with Parameter from same Class...
		double c=a/b;
		return c;
	}
	
	public static double div1(double a,double b)
	{
		//Static Method Return type with parameter from Different Class...
		double d=a/b;
		return d;
	}
	
	public double div2(double a,double b)
	{
		//Non Static Method Return Type with parameter from same Class...
		double e=a/b;
		return e;
	}
	
	public double div3(double a,double b)
	{
		// Non static Method return type with parameter from Different Class...
		double d=a/b;
		return d;
	}
	
	public static void main(String[] args) {
		
		Prog7_1_all_Steps a= new Prog7_1_all_Steps();
		name();
		System.out.println("____________________________________________________________________");
		a.name2();
		System.out.println("____________________________________________________________________");
		add(68,36);
		System.out.println("____________________________________________________________________");
		a.add2(26,84);
		System.out.println("____________________________________________________________________");
		int b=sub();
		System.out.println("Static Method return type from same Class");
		System.out.println("Total= "+b);
		System.out.println("____________________________________________________________________");
		int c=a.sub2();
		System.out.println("Non Static Method return type from Same Class");
		System.out.println("Total= "+c);
		System.out.println("____________________________________________________________________");
		double d=div(15.5,2.5);
		System.out.println("Static Method Return type with parameter from same class");
		System.out.println("Total= "+d);
		System.out.println("____________________________________________________________________");
		double e=a.div2(19.2,7.6);
		System.out.println("Non Static Method return type with parameter from Same Class");
		System.out.println("Total= "+e);
		System.out.println("____________________________________________________________________");

	}

}
