package ThisKeyword;
// this keyword
public class Prog1 {

	public void show()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
	Prog1 a= new Prog1();
	System.out.println(a);		//showing unique id of 'a' object.
	a.show();
	
System.out.println("================================");
Prog1 b = new Prog1();		
System.out.println(b);
b.show();
	}

}
