package Super_Keyword;

public class Super_this_combo_C extends Super_this_combo_P{

	int a=22;
	public void show()
	{
		int a=33;
		System.out.println("Child Local value A = "+a);	// accessing local variable same class
		System.out.println("Child Global value A = "+this.a);	// accessing Global variable same class
		System.out.println("Parents Global value A = "+super.a);	// Accessing Global variable different class
	}
}
