package String_Prog;
// substring() = we gives number input, we takes output is Printing String from that position of input.
// substring( , ) = we gives number input, start point and end point, so output printing String is between that position of input 
// replace() = we replace that word into input word.
public class Progr09 {

	public static void main(String[] args) {
		String v = "java is a Platform Independent Language";
		
		System.out.println(v.substring(10));
		
		System.out.println(v.substring(10, 20));
		
		System.out.println(v.replace("is", "was"));

	}

}
