package Interface_Program;

public class Prog1_C implements Prog1_P{

	@Override
	public void show() {
		System.out.println("Atul Joshi");
		
	}

	@Override
	public void add() {
		int a=10,b=20;
		System.out.println("Addition = "+(a+b));
		
	}

}
