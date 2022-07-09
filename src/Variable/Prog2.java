package Variable;

public class Prog2 {
	static int a=10;			// Static/ Global Variable
	public void add()
	{
		int b=20;
		System.out.println(a+"\t"+b);
		
		a++;			//Increment operator
		b++;
		
	}

	public static void main(String[] args) {
		Prog2 ab= new Prog2();
		ab.add();
		ab.add();
		ab.add();  
	}

}
