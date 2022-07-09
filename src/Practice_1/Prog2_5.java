package Practice_1;
// WAP to perform addition, multiplication, division and subtraction using method
public class Prog2_5 {

	public void all(double a, double b)
	{
		double s,m,d,ad;
		ad=a+b;
		s=a-b;
		d=a/b;
		m=a*b;
		System.out.println("Addition Of Two Numbers = "+ad);
		System.out.println("Subtraction Of Two Numbers = "+s);
		System.out.println("Multiply of Two Numbers = "+m);
		System.out.println("Division Of Two Numbers = "+d);
	}
	public static void main(String[] args) {
		Prog2_5 ab= new Prog2_5();
		ab.all(30, 5);
		System.out.println("---------------------------------");
		ab.all(60.5, 7.6);

	}

}
