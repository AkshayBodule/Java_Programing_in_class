package BasicProgram;

public class VariableType2 {
	
	static int a =10; //Static a = 10 11 12 13
	int b = 20; //Global/Instance
	public void show()
	{
	a++; //a=11
	b++; //b=21
	System.out.println(a + " " + b); //11 21 12 21
	}

	public static void main(String[] args) {
		
		VariableType2 a = new VariableType2(); //memory1
		//a=10->11 b=20->21
		a.show(); //b=21
		VariableType2 b = new VariableType2(); //memory2
		b.show(); //b=21
		//a=11->12 b=20->21
	}

}
