package Collection_Program;

import java.util.LinkedList;

public class Prog03_Linked {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.add("Tom");
		l.add("jerry");
		l.add("duck");
		l.add(null);
		l.add(12);
		
		System.out.println(l);
		
		l.add("Tom");
		l.add("jerry");
		l.add("duck");
		l.add(null);
		l.add(12);
		
		System.out.println(l);
		System.out.println(l.indexOf("duck"));
		l.add(2,"Micky");

		System.out.println(l);
		System.out.println(l.indexOf("duck"));
		
	}

}
