package Collection_Program;

import java.util.TreeSet;

public class Prog06_TreeSet {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		System.out.println(t.size());
		System.out.println(t.isEmpty());
		
		t.add("Z");
		t.add("A");
		t.add("B");
		System.out.println(t);
	}

}
