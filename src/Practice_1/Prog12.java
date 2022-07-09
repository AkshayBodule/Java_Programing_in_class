package Practice_1;
// WAP to add, subtract, multiplication, division by switch statement
public class Prog12 {

	public static void main(String[] args) {
		
		int ch=1;
		double a=20,b=5,t;
		System.out.println("\t MENU");
		System.out.println("\t 1. Additon");
		System.out.println("\t 2. Subtraction");
		System.out.println("\t 3. Multiplication");
		System.out.println("\t 4. Division");
		System.out.println();
		switch(ch)
		{
		case 1:
			t=a+b;
			System.out.println("Addition = "+t);
			break;
		case 2:
			t=a-b;
			System.out.println("Subtraction = "+t);
			break;
		case 3:
			t=a*b;
			System.out.println("Multiplication = "+t);
			break;
		case 4:
			t=a/b;
			System.out.println("Division = "+t);
			break;
		default:
				System.out.println("Error Entities");
		}
		
	}

}
