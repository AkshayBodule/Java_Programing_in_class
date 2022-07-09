package Practice_1;
// WAP to subtract two number by using method
public class Prog2_2 {

	public void sub(double a,double b)
	{
		double t=a-b;
		System.out.println("Subtraction = "+t);
	}
	public static void main(String[] args) {
		Prog2_2 ab= new Prog2_2();
		ab.sub(45.5,12.8);
		ab.sub(35, 15);

	}

}
