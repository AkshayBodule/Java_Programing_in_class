package StaticMethods;
// Static Method Call from Same Class ;
public class Prog1 {

	public static void show()		// User Defined Function
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i*i*i+" ");
		}
		System.out.println();
	}
	
	public static void display()		// User Defined Function
	{
		int i=100;
		while(i<=200)
		{
			if(i%5==0 && i%3==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
	}
	
	public static void main(String[] args) {		//Pre defined Function
		System.out.println("PRINT VALUES");
		show();
		System.out.println();
		display();

	}

}
