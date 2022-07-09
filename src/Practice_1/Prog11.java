package Practice_1;
// WAP to check payment is allowed on POS machine by using nested if
public class Prog11 {

	public static void main(String[] args) {
		int pass=1234;
		String id= "abcd";
		
		if(id=="abcd")
		{
			if(pass==1234)
			{
				System.out.println("Your Ammout is 1200000000 rs.");
			}
			else
			{
				System.out.println("Enter Valid Password");
			}
		}
		else
		{
			System.out.println("Enter Valid Id");
		}

	}

}
