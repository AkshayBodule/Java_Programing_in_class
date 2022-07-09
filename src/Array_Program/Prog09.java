package Array_Program;

import java.util.Scanner;

public class Prog09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Enter tWo array");
		a=sc.nextInt();
		b=sc.nextInt();
		int c[][] = new int[a][b];		//	c[3][3]
		System.out.println("Enter Array");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array Are");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
