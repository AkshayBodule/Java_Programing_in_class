package type_Casting;

public class Prog2_Implement {

	public static void main(String[] args) {
		//Single level Inheritance
		Prog2_C a = new Prog2_C();
		a.home();
		a.car();
		System.out.println("-----------------------");
		
		//Up-casting
		Prog2_P c = new Prog2_C();
		c.home();
		System.out.println("-----------------------");
		//Down Casting		
		Prog2_C b = (Prog2_C) new Prog2_P();
		b.home();
		b.car();

		

	

	}

}
