package Non_StaticMethods;

public class Prog6_2 {

	public static void main(String[] args) {
		Prog6_1 a=new Prog6_1();
		int b=a.add1();
		System.out.println("Addition From Different class= "+b);
		double c=a.div();
		System.out.println("Division from Differnt class= "+c);
	}

}
