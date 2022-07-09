package Collection_Program;

import java.util.ArrayList;
import java.util.HashSet;

public class Prog01_ArrayList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		ArrayList a2 = new ArrayList(500);
		System.out.println(a2.size());
		ArrayList a3 = new ArrayList(a2);
		System.out.println(a3.size());
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println("---------------------------");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		
		a1.add("Akki");
		a1.add(2,"Harry");
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
		a1.add("Akki");
		a1.add(3,"Harry");
		
		System.out.println(a1.contains("Akki"));
		a1.set(2,"Google");
		System.out.println(a1);
		
		HashSet h = new HashSet(a1);
		System.out.println(h);
		
	}

}
