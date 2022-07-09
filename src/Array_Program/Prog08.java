package Array_Program;

import java.util.Scanner;

public class Prog08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[][] = new String[4][4];
		System.out.println("Enter Names");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]= sc.next();
			}
		}
		
		System.out.println("Names is");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
