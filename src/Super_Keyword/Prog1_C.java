package Super_Keyword;
// "super" keyword access parent class variable
// if both Global child class and Global Parent class are same, 
// then accessing Global Parent class "super" Keyword is used..
public class Prog1_C extends Prog1_P
{

	int a=333;		//Global/ Instance Variable
	public void show()
	{
		System.out.println("Global Variable same class A = "+a);
		System.out.println("Global Variable Diff Class A = "+super.a);
		System.out.println("Global Variable Diff Class B = "+b);
	}
	
}
