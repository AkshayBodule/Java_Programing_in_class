package HashMap_Program;

import java.util.HashMap;

public class Prog01 {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		h.put(1, "Atul");
		h.put(3, "Akki");
		h.put(4, "ash");
		h.put(2, "chandra");
		
		System.out.println(h);
		
	}

}
