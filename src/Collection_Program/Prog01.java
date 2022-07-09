package Collection_Program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Prog01 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.add("atul");
		a.add("bhai");
		a.add("don");
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.add("atul");
		a.add(null);
		System.out.println(a);
		a.add(25);
		a.add(null);
		
		System.out.println(a);
		a.add(1,"Joshi");
		
		System.out.println(a);
		a.remove(1);
		
		System.out.println(a);
		a.add(14);
		a.add("atul");
		a.add("bhai");
		a.add("don");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains("atul"));
		

		
		
	}

}
