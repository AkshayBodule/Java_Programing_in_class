package Collection_Program;

import java.util.LinkedHashSet;

public class Prog05_LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet l = new LinkedHashSet();
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		
		l.add("A");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add(10);
		System.out.println(l);
		
		l.add("A");
		System.out.println(l);
		
		System.out.println(l.contains("A"));
		System.out.println(l.isEmpty());
		l.remove("a");
		System.out.println(l);
		
	}

}
