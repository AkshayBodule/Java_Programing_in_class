package String_Prog;

public class Prog03 {

	public static void main(String[] args) {
		String a = "AKKI";
		String b = "AKKI";
		String c = "akki";
		
		String d = new String("Nagpur");
		String e = new String("Nagpur");
		String f = new String("nagpur");
		
		
		System.out.println(a.equals(b)); // true... a comparing to b
		System.out.println(a.equals(c));  // False.. becz value of a is capital and value of c is small letters
		System.out.println(a.equalsIgnoreCase(c)); // ignore cases
		System.out.println("------------------------------------");
		System.out.println(d.equals(e));
		System.out.println(d.equals(f));
		System.out.println(d.equalsIgnoreCase(f));
	}

}
