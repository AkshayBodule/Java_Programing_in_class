package String_Prog;
// charAt() =  we have to enter Number and it gives character on that position.
// indexOf() = we have to enter character and it gives first position of that character..
// lastIndexOf() =  we have to enter character and it gives Last position of that character..
public class Progr07 {

	public static void main(String[] args) {
		
		String i = "Nothing is Forever except Change.";
		
		System.out.println("charAt() method = "+i.charAt(28)); //enter position in number and gives character on that position..
		
		System.out.println("indexOf() method = "+i.indexOf('F'));  
		
		System.out.println("lastIndexOf() method = "+i.lastIndexOf('a'));
	}

}
