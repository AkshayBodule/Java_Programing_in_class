package StaticMethods;
// Static method call from different class ;two programs are Prog2_1 or Prog2_2 ;
public class Prog2_1 {
	public static void even()
	{
		for(int i=2;i<=50;i=i+2)
		{
			System.out.print(i+ " ");
		}
	}
	
	public static void odd()
	{
		for(int i=1;i<=50;i=i+2)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void num()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+"\t");
		}
	}
	
	public static void sq()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i*i+"\t");
		}
	}

}
