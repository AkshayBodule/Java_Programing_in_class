package Collection_Program;

import java.util.LinkedHashSet;

public class Prog05_LinkedHash {

	public static void main(String[] args) {

		LinkedHashSet l = new LinkedHashSet();
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.add("bana");
		l.add("shankari");
		l.add(null);
		l.add(123);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l);
		l.add(null);
		l.add("bana");
		System.out.println(l);
		l.remove(null);
		System.out.println(l);
		
		
		
		
	}

}
