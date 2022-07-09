package Logical_Program;

import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int count=0,a = sc.nextInt();
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}

		if(count==0)
		{
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("Not PRime Number");
		}
	}

}
