package This_Keyword;
// Printing Global variable and local variable using this keyword...
//- when Global or Local variable is same then by default local variable printed, 
//- if we want to print Global variable then we have to use 'this' keyword...
public class Prog2 {

	int a=11;
	Prog2(int a)			//Constructor with Parameter 
	{
		System.out.println("Contructor Local value is = "+a);
		System.out.println("Contructor Global value is = "+this.a);
	}
	
	public void show(int a)			// Non static method with Parameter
	{
		System.out.println("Local var = "+a);
		System.out.println("Global var = "+this.a);
	}
	
	public void disp()
	{
		System.out.println("Global Variable = "+this.a);
	}
	public static void main(String[] args) {
		Prog2 x= new Prog2(22);		//by default Constructor calling
		x.show(33);					// Method calling
		x.disp();
		

	}

}
