package Non_StaticMethods;

public class Prog7_2 {

	public static void main(String[] args) {
		Prog7_1_all_Steps b= new Prog7_1_all_Steps();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		Prog7_1_all_Steps.name1();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		b.name3();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		Prog7_1_all_Steps.add1(156,945,632);
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		b.add3(654,123,785);
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		int d = Prog7_1_all_Steps.sub1();
		System.out.println("Static Method Return type from Different Class");
		System.out.println("Total= "+d);
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		int e=b.sub3();
		System.out.println("Non Static Method return type from Different Class");
		System.out.println("Total= "+e);
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		double f = Prog7_1_all_Steps.div1(154.2,65.9);
		System.out.println("Static Method return type with parameter from Different Class");
		System.out.println("Total= "+f);
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		double g = b.div3(951.6,45.2);
		System.out.println("Non Static Method return type with parameter From Different Class");
		System.out.println("Total= "+g);
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
	}

}
