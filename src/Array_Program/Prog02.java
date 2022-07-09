package Array_Program;

import java.util.Scanner;

public class Prog02 {

	public static void main(String[] args) {
		// Class vari = new class();
		int b[] = new int[5];
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Elements");
		for(int i=0;i<5;i++)
		{
			b[i]=a.nextInt();
		}
		System.out.println("Elements Are = ");
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		
		
	}

}
