package Polymorphism;

public class Prog2_Implement {

	public static void main(String[] args) {
		Prog2_C a = new Prog2_C();
		a.Emp();
		System.out.println("-----------------------");
		Prog2_P b = new Prog2_P();
		b.Emp();
		System.out.println("-----------------------");
		Prog2_P c = new Prog2_C();
		c.Emp();
		
		

	}

}
