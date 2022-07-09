package Practice_1;
// WAP to multiply two number by using method
public class Prog2_3 {

	public void mul(double a, double b)
	{
		double t=a*b;
		System.out.println("Multiplication of Two Numbers = "+t);
	}
	public static void main(String[] args) {
		Prog2_3 x= new Prog2_3();
		x.mul(12.5, 6.8);
		x.mul(10, 20);

	}

}
