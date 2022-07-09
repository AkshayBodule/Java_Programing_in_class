package Array_Program;

import java.util.Scanner;

public class Prog03 {

	public static void main(String[] args) {
		String a[] = new String[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Strings ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		
		System.out.println("String Are");
		for(String f:a)
		{
			System.out.println(f);
		}
	}
	
}
