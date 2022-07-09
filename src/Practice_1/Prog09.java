package Practice_1;
// WAP to add, subtract, multiplication, division by if else statement
public class Prog09 {

	public static void main(String[] args) {
		int i=1;
		double a=20,b=3.5,t;
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println();
		if(i==1)
		{
			t=a+b;
			System.out.println("Additon = "+t);
		}
		else if(i==2)
		{
			t=a-b;
			System.out.println("Subtraction = "+t);
		}
		else if(i==3)
		{
			t=a*b;
			System.out.println("Multiplication = "+t);
		}
		else if(i==4)
		{
			t=a/b;
			System.out.println("Division = "+t);
		}
		else
		{
			System.out.println("Error");
		}

	}

}
