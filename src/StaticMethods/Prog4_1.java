package StaticMethods;
// Static method with parameter from different class ;
public class Prog4_1 {

	public static void ad(int a)
	{
		int sum=a+a;
		System.out.println("ADD= "+sum);
	}
	
	public static void sb(int a,int b)
	{
		int sub=a-b;
		System.out.println("SUBTRACTION= "+sub);
	}
	
	public static void mul(double a,double b)
	{
		System.out.println("MULTI= "+(a*b));
	}
	
	public static void cho(int i,char a)
	{
		switch(a)
		{
		case 's':
			System.out.println("Square= "+(i*i));
			break;
		case 'c':
			System.out.println("Cube= "+(i*i*i));
			break;
		default:
			System.out.println("ERROR");
			
		}
	}
}
