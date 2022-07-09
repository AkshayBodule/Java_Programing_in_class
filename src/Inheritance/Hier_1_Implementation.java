package Inheritance;

public class Hier_1_Implementation {

	public static void main(String[] args) {
	
		Hier_1_C1 a= new Hier_1_C1();
		a.home();
		a.Farm();
		a.car();
		a.laptop();
		System.out.println("----------------------------------");
		Hier_1_C2 b= new Hier_1_C2();
		b.home();
		b.Farm();
		b.car();
		b.Mob();
	}

}
