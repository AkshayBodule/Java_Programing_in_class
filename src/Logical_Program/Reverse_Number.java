package Logical_Program;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int num = 524578963;
		int rev=0, temp, multifactor = 100000000;
		System.out.println("Number = "+num);
		for(int i=1;i<=9;i++)
		{
			temp = num%10;
			num = num/10;
			rev = rev +(temp*multifactor);
			multifactor = multifactor/10;
			
			
		}
		
		System.out.println("Reverse= "+rev);
	}

}
