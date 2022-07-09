package String_Prog;

public class Prog02 {

	public static void main(String[] args) {
		String a = "NARUTO";
		String b = "NARUTO";
		String c = "naruto";
		
		String d = new String("NineTail");
		String e = new String("NineTail");
		
		int f=10,g=10;
		
		System.out.println(f==g); // true  value comparison
		System.out.println(a==b); // true value comparison
		System.out.println(d==e); // False  Address Comparison
		
		// using concat
		System.out.println(c);
		c=c.concat(" Uzumaki");	// connect two strings
		System.out.println(c);

		
		StringBuffer sb = new StringBuffer("Domnic");
		System.out.println(sb);
		sb.append(" Torrato");
		System.out.println(sb);
	}

}
