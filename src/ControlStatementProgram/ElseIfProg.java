package ControlStatementProgram;

public class ElseIfProg {

	public static void main(String[] args) {
		
		int cheMarks = 39;
		if(cheMarks>=40 && cheMarks<60)
		{
		System.out.println("Student is pass in second class");
		}
		else if(cheMarks>=60 && cheMarks<75)
		{
		System.out.println("Student is pass in first class");
		}
		else if(cheMarks>=75 && cheMarks<90)
		{
		System.out.println("Distinction");
		}
		else if(cheMarks>=90 && cheMarks<=100)
		{
		System.out.println("Merit");
		}
		else if(cheMarks>100)
		{
		System.out.println("Wrong input, please enter the correct marks");
		}
		else
		{
		System.out.println("Student is failed in chemistry");
		}
		}
		}
		//<40 ---> Fail
		//40-59 ---> Second Class
		//60-74 ---> First class
		//75-89 ---> Distinction
		//90-100 ---> Merit
		//110 ---> Wrong input