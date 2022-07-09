package Inheritance;

public class Single_Level_C extends Single_Level_p{

	public void Bike()
	{
		System.out.println("Child have Bike");
	}
	
	public static void main(String[] args) {
		Single_Level_C a=new Single_Level_C();
		a.Home();
		a.Car();
		a.Money();
		a.Bike();
	}

}
