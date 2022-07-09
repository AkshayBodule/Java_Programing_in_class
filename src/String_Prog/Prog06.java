package String_Prog;

public class Prog06 {

	public static void main(String[] args) {
		String name1 = "Pune";
		String name2 = "Mumbai";
		String name3 = "Pune";
		
		String name = name1+name2;
		System.out.println("concat by + = "+name);
		
		String name4 = name1.concat(name2).concat(name3);
		System.out.println("Concat by String Method = "+name4);
		
		String str1 = "I am learning Selenium Automation";
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(14));
		
		System.out.println(str1.substring(5, 13));
		System.out.println(str1.substring(2, 5));
		
		System.out.println(str1.contains("tion"));
		System.out.println(str1.contains("Am"));	// checking word is Present in String or not.
	}

}
