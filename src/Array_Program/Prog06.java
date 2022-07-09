package Array_Program;
// Ascending and Descending Order of Array
import java.util.Arrays;
import java.util.Scanner;

public class Prog06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter Numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		Arrays.sort(a);								// Sorted Array in Ascending Order
		System.out.println("sorted Assending");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"\t");
		}

	}

}
