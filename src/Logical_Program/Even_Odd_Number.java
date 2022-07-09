package Logical_Program;

import java.util.Scanner;

public class Even_Odd_Number {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		a= sc.nextInt();
		if(a%2==0)
		{
			System.out.println("even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}

	}

}
