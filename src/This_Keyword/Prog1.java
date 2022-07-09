package This_Keyword;
// Program showing unique referral id;
public class Prog1
{
	public void show()
	{
		System.out.println(this);			// "this" is printing for unique id..
	}
	
	public static void main(String[] args)
	{
		Prog1 a= new Prog1();
		System.out.println(a);		// printing object unique id
		a.show();
		
		Prog1 b = new Prog1();
		System.out.println(b);
		b.show();

	}

}
