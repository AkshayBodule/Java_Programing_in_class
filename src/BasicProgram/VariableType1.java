package BasicProgram;

public class VariableType1 {
	
	static int a =10; //Global/Instance
	
	public static void show()		//new method
	{
	int b=20;
	System.out.println("B = " + b);
	//21
	}

	public static void main(String[] args) {
		
		System.out.println("A = " + a);
		show();					// call show method

	}

}
