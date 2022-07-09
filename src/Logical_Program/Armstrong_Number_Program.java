package Logical_Program;

public class Armstrong_Number_Program {

	public static void main(String[] args) {
		int a=123,temp,arm_num=0,b=a;
		
		for(int i=1;i<=3;i++)
		{
			temp = b%10;
			b=b/10;
			arm_num = arm_num+(temp*temp*temp);
			
		}
		
		if(a==arm_num)
		{
			System.out.println("Armstrong Number");
			System.out.println(a+" == "+arm_num);
		}
		else
		{
			System.out.println("Not Armstrong Number");
			System.out.println(a+" == "+arm_num);
		}

	}

}
