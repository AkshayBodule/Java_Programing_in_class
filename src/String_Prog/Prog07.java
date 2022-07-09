package String_Prog;

public class Prog07 {

	public static void main(String[] args) {
		String a = "";
		String b = "Goku";
		String c = "I am in Engineering College";
		
		System.out.println("A is Empty String = "+a.isEmpty());
		System.out.println("B is charAt = "+b.charAt(3));
		String d = c.replace("am", "will be");
		System.out.println("c is Replace = "+c.replace("am","Was"));
		
		System.out.println(d);
	}

}
