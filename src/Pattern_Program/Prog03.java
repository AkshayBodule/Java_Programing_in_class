package Pattern_Program;

public class Prog03 {

	public static void main(String[] args) {

		//111
		//222
		
		for(int row=1;row<=2;row++)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------");
		
		//123
		//123
		for(int row=1;row<=2;row++)
		{
			for(int num=1;num<=3;num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
