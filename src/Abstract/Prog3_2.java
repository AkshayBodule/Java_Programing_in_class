package Abstract;

abstract public class Prog3_2 extends Prog3_1{

	@Override
	public void add() {
		int a=55,b=30;
		System.out.println("Addition = "+(a+b));
	}

	@Override
	public void sub() {
		int a=85,b=60;
		System.out.println("Subtraction = "+(a-b));
		
	}

	abstract public void mul();
	
	
}
