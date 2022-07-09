package ControlStatementProgram;

public class NestedIf1 {

	public static void main(String[] args) {
		
		String pin = "1234";
		double amountInAcc = 1000;
		double amountToWithdraw = 2800;
		if(pin == "1234") //
		{
		if(amountToWithdraw <= amountInAcc)
		{
		System.out.println("We can debit the cash");
		}
		else
		{
		System.out.println("Insufficient amount");
		}
		}
		else
		{
		System.out.println("Incorrect pin");
		}

	}

}
