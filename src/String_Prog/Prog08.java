package String_Prog;

public class Prog08 {

	public static void main(String[] args) {
		String a = "Nothing is Forever except Change.";
		
		String b[] = a.split(" ");
		for(int i=0;i<a.length();i++)
		{
			System.out.println(b[i]);
		}
	}

}
