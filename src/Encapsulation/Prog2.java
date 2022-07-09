package Encapsulation;

public class Prog2 {

	private String password;
	
	public void show(String a)
	{
		password = a;
	}
	
	public void display()
	{
		System.out.println("Password is = "+ password);
	}
}
