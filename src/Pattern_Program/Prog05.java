package Pattern_Program;
//    *
//   ***
//  *****
// *******
//*********
public class Prog05 {

	public static void main(String[] args) {

		int star=1,space=4;
		for(int row=1;row<=5;row++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
			
		}
		
	}

}
