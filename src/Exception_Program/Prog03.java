package Exception_Program;

public class Prog03 {

	public static void main(String[] args) {
	
		System.out.println("Statement1");
		try
		{
			System.out.println("Statement 2");
			System.out.println("Statement 3"+(10/0));
			System.out.println("Statement 4");
		}
		catch(Exception e)
		{
			System.out.println("Statement 5"+(10/0));
			System.out.println("Statement 6");
		}
		finally
		{
			System.out.println("Statement 7");
		}
		System.out.println("Statement 8");
	}

}
