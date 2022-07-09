package Array_Program;

import java.util.Scanner;

public class Prog05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		System.out.println("Enter Number");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Output");
		for(int f:a)
		{
			System.out.println(f);
		}
	}

}
