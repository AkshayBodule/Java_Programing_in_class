package String_Prog;

public class Prog05 {

	public static void main(String[] args) {
		String a = "I am Computer Engineer";
		
		System.out.println(a.indexOf('E'));	// checking First index/position of Char.
		System.out.println(a.lastIndexOf('n')); // checking Last index/position of Char.
		
		System.out.println(a.startsWith("I"));		// checking First word of String
		System.out.println(a.endsWith("eer"));	// checking End of String
	}

}
