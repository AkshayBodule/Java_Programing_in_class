package Collection_Program;

import java.util.ArrayList;
import java.util.Vector;

public class Prog02_Vector {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		Vector v2 = new Vector(1000);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		Vector v3 = new Vector(v2);
		System.out.println(v3.size());
		System.out.println(v3.capacity());
		
		Vector v4 = new Vector(2,5);
		System.out.println(v4.size());
		System.out.println(v4.capacity());
		
		for(int i=1;i<=5;i++)
		{
			v4.add(i);
		}
		
		System.out.println(v4);

		System.out.println(v4.capacity());
		
		v4.add(6);
		v4.add(7);
		v4.add(8);
		System.out.println(v4);
		System.out.println(v4.capacity());
		
		v4.addElement(11);
		System.out.println(v4);
		
	}

}
