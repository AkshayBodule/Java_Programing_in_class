package Non_StaticMethods;
// Non Static Method call from Same Class...
public class Prog1 {

	public void display()
	{
		System.out.println("If you don't take risks, you can't create a Future....");
	}
	
	public static void main(String[] args) {
		
	Prog1 a= new Prog1();
	a.display();

	}

}
