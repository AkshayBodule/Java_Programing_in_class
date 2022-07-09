package Collection_Program;

import java.util.Iterator;
import java.util.Vector;

public class Prog08_Iterator {

	public static void main(String[] args) {
		Vector v = new Vector();
		
//		v.add("aaa");
//		v.add("bbb");
//		v.add("ccc");
//		v.add(123);
//		v.add(null);
//		System.out.println(v);
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		Iterator j = v.iterator();
		while(j.hasNext())
		{
			int n = (int) j.next();
			
		if(n%2==0)
		{
		System.out.println(n);	
		}
		else
		{
			j.remove();
		}
		}
		System.out.println(v);
		
	}

}
