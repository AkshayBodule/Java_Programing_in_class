package Polymorphism;
// compiler run time.... Method overloading...
public class Prog1_Implement {

	public static void main(String[] args) {
		Prog1_P a= new Prog1_P();
		a.add();
		a.add(11);
		a.add(11,22);
		a.add(33.0);
		a.add(55.5, 44.5);
		a.add(12, 15, 63);
	}

}
