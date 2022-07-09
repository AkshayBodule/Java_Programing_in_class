package Collection_Program;

import java.util.LinkedList;

public class Prog03_LinkedList {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		System.out.println(l1.size());
		
		l1.add(10);
		l1.add("abc");
		l1.add('A');
		l1.add(12.5);
		l1.add(null);
		
		System.out.println(l1);
		l1.add(10);
		l1.add("abc");
		l1.add('A');
		System.out.println("----------------------");
		System.out.println(l1);
		
		//l1.remove("abc");
		l1.removeLastOccurrence("abc");
	
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.addFirst("ddd");
		l1.addLast("zzz");
		System.out.println(l1);
		System.out.println(l1.contains("AA"));
		
		
		
		
		
	}

}
