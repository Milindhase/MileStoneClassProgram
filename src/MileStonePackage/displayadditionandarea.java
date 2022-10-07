package MileStonePackage;
import java.util.*;

public class displayadditionandarea {
	

	public static void main(String args[])
	{
		//display();
		displayadditionandarea a=new displayadditionandarea();
		a.display1();
		student.display2();
		student s=new student();
		s.show();
		System.out.println("display value of k because  k is a static variable" +student.k);
		
		
	}
	
	public static void display()
	{
		/*int a,b,sum=0,Addition,Substraction,Multiplication,Division,r;
		double area;
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter your  A & B value");
		 a = sc.nextInt();
		 b = sc.nextInt();
		 System.out.println("Enter your radius R");
		 r = sc.nextInt();
		 
	      Addition = a+b;
	      Substraction = a-b;
	      Multiplication = a*b;
	      Division = a/b;
	      area = 3.142*r*r;
	      
	System.out.println("**********************************************");
	System.out.println(" Addition===>  " +Addition);
	System.out.println(" Substraction===>  " +Substraction);
	System.out.println(" Multiplication===>  " +Multiplication);
	System.out.println(" Division===>  " +Division);
	System.out.println(" Area of circle ===>  " +area);		*/
	
	}
	
	void display1()
	{
		System.out.println("Hi i am out side of the class");
	}
}

class student{

	static int k=20;
	int u=60;
	
	static void display2()
	{
		System.out.println("Helllo i am static method in outside out class call me main method");
	    System.out.println("display value of k because  k is a static variable" +k);
	//    System.out.println("display value of u because  u is a NON-static variable" +u);
	
	}
	
	void show()
	{
	System.out.println("Hello i am non-static method out of class call me in main method");	
	System.out.println("display value of k because  k is a static variable" +k);
    System.out.println("display value of u because  u is a NON-static variable" +u);

	}

}
