package Interface_Program;

import java.util.Scanner;

public class Prog2_C implements Prog2_P
{
	Scanner sc = new Scanner(System.in);
	int empid,age;
	String name;
	double salary;

	@Override
	public void getemp() {
		System.out.println("Enter id");
		empid = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter Salary");
		salary = sc.nextDouble();
		
	}

	@Override
	public void putemp() {

		System.out.println("Emp Id = "+empid);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
	}

}
