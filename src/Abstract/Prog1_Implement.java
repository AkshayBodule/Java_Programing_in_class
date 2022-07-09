package Abstract;

public class Prog1_Implement {

	public static void main(String[] args) {
	//	Prog1_P x= new Prog1_P();	// Can not create object of abstract class
		
		Prog1_C a = new Prog1_C();
		a.show();
		a.show1();
		a.display();
		a.add(25, 45);
		a.div(12.5, 2.5);
		
	}

}
