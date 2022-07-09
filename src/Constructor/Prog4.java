package Constructor;

public class Prog4 {
	
	int a,b;
	Prog4()
	{
		a=10;
		
	}
	Prog4(int c)
	{
		b=c;
		
	}
	Prog4(int c,int d)
	{
		a=c;
		b=d;
		
	}
	
	public void disp()
	{
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
	public static void main(String[] args) {
		Prog4 x=new Prog4();
		x.disp();
		System.out.println("********************");
		Prog4 y=new Prog4(15);
		y.disp();
		System.out.println("********************");
		Prog4 z=new Prog4(15,25);
		z.disp();
	}

}
