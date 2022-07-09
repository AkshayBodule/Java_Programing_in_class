package Collection_Program;

import java.util.Vector;

public class Prog02_vec {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		
		v.add("chandra");
		v.add("shekhar");
		v.add("bangar");
		v.add(123);
		v.add(null);
		
		System.out.println(v);
		
		v.add("chandra");
		v.add("shekhar");
		v.add("bangar");
		v.add(123);
		v.add(null);
		
		v.add("tom");
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		
		v.add(2, "Software Tester");
		System.out.println(v);
		
		v.remove(2);
		System.out.println(v);
		
		v.set(2, "BANGAR");
		System.out.println(v);
		System.out.println(v.indexOf(123));

		v.removeElement(123);
		System.out.println(v);
		
		
		
	}

}
