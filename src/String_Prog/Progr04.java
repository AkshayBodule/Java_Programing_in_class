package String_Prog;
// equals() = we check two String are equal or not(checking capital letter or small letter to)
// equalsIgnoreCase() = We check two String are equal or not but we Ignore Cases(Ignoring Capital letter or small letters)
public class Progr04 {

	public static void main(String[] args) {
	
		String a = "Goku";
		String b = "Goku";
		String c = "goku";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
	}

}
