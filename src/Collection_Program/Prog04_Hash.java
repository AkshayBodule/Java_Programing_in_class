package Collection_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class Prog04_Hash {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		h.add("Atul");
		h.add("Akki");
		h.add("Chandu");
		h.add("ash");
		h.add(null);
		System.out.println(h);
		
		h.add(null);
		h.add(123);
		System.out.println(h);
		
		h.remove("Chandu");
		
		System.out.println(h);
		
		ArrayList a = new ArrayList(h);
		a.add("Atul");
		a.add("Akki");
		a.add("Chandu");
		a.add("ash");
		a.add(null);
		
		System.out.println(a);
		
	}
}
