package Logical_Program;

public class Add_number {

	public static void main(String[] args) {
		int a=54896;
		int temp,sum=0;
		
		for(int i=1;i<=5;i++)
		{
			temp = a%10;
			a=a/10;
			sum = sum+temp;
		}
		System.out.println("Addition of number = "+sum);
		

	}

}
