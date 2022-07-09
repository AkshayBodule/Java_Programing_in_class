package ControlStatementProgram;

public class NestedIf {

	public static void main(String[] args) {
	
		String fbId = "velocity1";
		String fbPass = "Admin@123";
		if(fbId == "velocity") //
		{
		if(fbPass == "Admin@123")
		{
		System.out.println("Login sucessfully");
		}
		else
		{
		System.out.println("Password incorrect");
		}
		}
		else
		{
		System.out.println("You entered wrong id");
		}
	}

}
