package Logical_Program;

import java.util.Scanner;

public class Factorial_Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int temp=1;
		int a = sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			temp = temp * i;
		}
		
		System.out.println("Factorial = "+temp);

	}

}
