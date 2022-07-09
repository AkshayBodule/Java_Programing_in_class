package Array_Program;

import java.util.Scanner;

public class Prog04 {

	public static void main(String[] args) {
		String a[] = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 name");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("output");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
	}

}
