package ThisKeyword;
// if Instance/Global variable same as local variable then how to call global or local variable
public class Prog2 {

	int num=11;
	Prog2(int num)
	{
		System.out.println("Constructor Print Global Variable = "+num);
		System.out.println("Constructor Print Global Variable = "+this.num);
	}
	
	public void show(int num)
	{
		System.out.println("Show Method Print Local variable ="+ num);
		System.out.println("Show Method Print Global Variable = "+this.num);
	}
	public void disp()
	{
		System.out.println("Display Method Print Global variable ="+this.num);
	}
	public static void main(String[] args) {
		Prog2 x=new Prog2(99);
		x.show(22);
		x.disp();

	}

}
