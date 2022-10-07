package MileStonePackage;
import java.util.*;

public class Displaypersonalinfo {
	
	public static void main(String args[])
	{
		String sname,address; int age,marks;	double percentage; long mobileno;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		 sname= sc.nextLine();
		System.out.println("Enter Your Address");
		 address=sc.nextLine();		
		 System.out.println("Enter Your Mobile Number");
		mobileno = sc.nextLong();		
		System.out.println("Enter Your Age");
		age = sc.nextInt();
		System.out.println("Enter Your Marks");
		marks = sc.nextInt();
		System.out.println("Enter Your Percentage");
		percentage = sc.nextDouble();				
      	//sc.close();
		System.out.println("***********************************************");
		System.out.println("    Your Name ==>  " +sname);
		System.out.println("    Your Address ==>  " +address);
		System.out.println("    Your Mobile Number ==>  " +mobileno);
		System.out.println("    Your Age ==> " +age);
		System.out.println("    Your Marks ==>  " +marks);
		System.out.println("    Your percentage ==>  " +percentage);				
		System.out.println("***********************************************");
		}

}
