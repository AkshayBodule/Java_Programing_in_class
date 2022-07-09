package Non_StaticMethods;

public class Prog5 {

	public int add()
	{
		int a=10,b=30,c=50,t;
		t=a+b+c;
		return t;
	}
	
	public double div()
	{
		double a=100,b=5.9,t;
		t=a/b;
		return t;
	}
	public char ch()
	{
		int i=80;
		char grade;
		if(i>=85)
		{	grade='A';
		return grade;
		}
		else if(i>=50 && i<85)
		{
			grade='B';
			return grade;
		}
		else
		{
			grade='C';
			return grade;
		}
		
	}
	public static void main(String[] args) {
		Prog5 a= new Prog5();
		int b = a.add();
		System.out.println("Addition of two numbers= "+b);
		double c = a.div();
		System.out.println("Division of two numbers= "+c);
		char d = a.ch();
		System.out.println("Grade of a Student on his marks= "+d);

	}

}
