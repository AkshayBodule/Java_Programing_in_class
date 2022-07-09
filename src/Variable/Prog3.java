package Variable;
// Memory management by using static variable
public class Prog3 {

	int a=0;
	static int b=0;
	public void increment()
	{
		a++;
		b++;
		System.out.println("A = "+a+"\t"+"B = "+b);
		
	}
	
	public static void main(String[] args) {
		Prog3 x= new Prog3();
		x.increment();
		Prog3 y= new Prog3();
		y.increment();
		
	}

}
