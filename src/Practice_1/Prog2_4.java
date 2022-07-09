package Practice_1;
// WAP to divide two number by using method
public class Prog2_4 {

	public void Div(double a, double b)
	{
		double t=a/b;
		System.out.println("Division of Two Numbers = "+t);
	}
	
	public static void main(String[] args) {
		Prog2_4 ab= new Prog2_4();
		ab.Div(15, 2);
		ab.Div(25.6, 7);
	}

}
