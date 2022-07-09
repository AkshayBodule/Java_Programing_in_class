package Collection_Program;

import java.util.ArrayList;
import java.util.HashSet;

public class Prog04_HashSet {

	public static void main(String[] args) {

		HashSet hs1 = new HashSet();
		
		System.out.println(hs1.size());
		hs1.add("Z");
		hs1.add("D");
		hs1.add("A");
		hs1.add("B");
		System.out.println(hs1);
		hs1.add("z");
		hs1.add("d");
		hs1.add("a");
		hs1.add("b");
		System.out.println(hs1);
		hs1.add(10);
		hs1.add(5);
		hs1.add(7);
		hs1.add(1);
		hs1.add(null);
		
		System.out.println(hs1);
		hs1.remove("D");
		System.out.println(hs1.size());
		System.out.println(hs1.isEmpty());
		System.out.println(hs1);
		ArrayList ar1 = new ArrayList(hs1);
		System.out.println(ar1);
		System.out.println(ar1.get(3));
		System.out.println(ar1.indexOf("Z"));
		ar1.add(10);
		System.out.println(ar1);
	}

}
