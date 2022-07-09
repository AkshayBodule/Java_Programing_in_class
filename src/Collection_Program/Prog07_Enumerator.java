package Collection_Program;

import java.util.Enumeration;
import java.util.Vector;

public class Prog07_Enumerator {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		v.add(123);
		v.add(null);
		System.out.println(v);
		System.out.println("Enumeration Curser");
		Enumeration e = v.elements();
//		while(e.hasMoreElements())
//		{
//			System.out.println(e.nextElement());
//		}
		
		for(;e.hasMoreElements();)
		{
			System.out.println(e.nextElement());
		}
		
	}

}
