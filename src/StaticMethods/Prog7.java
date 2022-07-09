package StaticMethods;
// Static method with return type in same class
public class Prog7 
{
	public static String disp()
	{
		String s="This is Return Type Program";
		return s;
	}
	
	public static int fr()
	{
		int n=1,c=5,i;
		for(i=1;i<=c;i++)
		{
			n=n*i;
		}
		return n;
	

	}
	public static void main(String[] args) {
		
		String a = disp();
		System.out.println("\t String is ="+a);
		int b = fr();
		System.out.println("FOR loop= "+b);
		
	}

}
