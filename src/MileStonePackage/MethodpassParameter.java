package MileStonePackage;

import java.util.Scanner;

public class MethodpassParameter {
	
	public  static void main(String []args)
	{
		/// Que. 1) Write java program to find result of division of two numbers by passing parameter to method.
        int a,b;
		
		Scanner sc =new Scanner(System.in);
    	System.out.println(" Enter Value of X ==>  ");
    	a=sc.nextInt();
    	System.out.println(" Enter Value of Y ==> ");
    	b=sc.nextInt();
		
    	MethodpassParameter  obj=new MethodpassParameter( );
		
		obj.Division(a , b);               		
  }
	
	public void Division(int  x ,  int  y)
	{		
		int div,rem;
		div=x/y;
		rem=x%y;
		System.out.println(" division ==>  "+div);	
		System.out.println(" Reminder ==>  "+rem);
	}  

}
