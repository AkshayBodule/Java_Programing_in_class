package Abstract;

public class Prog1_C extends Prog1_P
{
	public void show1()
	{
		System.out.println("This is Child Class");
	}

	@Override
	public void display() {
		System.out.println("parents class incomplete method is complete in child class");
		
	}

	@Override
	public void add(int a, int b) {
	System.out.println("Addition two numbers= "+(a+b));
		
	}

	@Override
	public void div(double a, double b) {
		System.out.println("Division two Numbers= "+(a/b));
		
	}

	

}
