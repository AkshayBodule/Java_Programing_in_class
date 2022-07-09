package Array_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Prog07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[] = new String[5];
		System.out.println("Enter Names");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		Arrays.sort(a);
		System.out.println("Name Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
