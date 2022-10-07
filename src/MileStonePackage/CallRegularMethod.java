package MileStonePackage;
import java.util.*;

public class CallRegularMethod {
	
	public  static void main(String ags[])
	{  ///program to calculate Totalmarks and Percentagemarks, by calling one regular method into another regular method.
		
		CallRegularMethod crm=new CallRegularMethod();
		crm.Percentagemarks();}	
	
	public double Totalmarks() 
{     double java,php,syspro,Network,Csharp,Rdms,total;
		Scanner sc =new Scanner(System.in);
		
		 System.out.println(" Enter Your Java Marks ");
	     java=sc.nextFloat();	    
	     System.out.println(" Enter Your php Marks ");
	     php=sc.nextFloat();    
	     System.out.println(" Enter Your syspro Marks ");
	     syspro=sc.nextFloat();	    
	     System.out.println(" Enter Your Network Marks ");
	     Network=sc.nextFloat();	     
	     System.out.println(" Enter Your Csharp Marks ");
	     Csharp=sc.nextFloat();    
	     System.out.println(" Enter Your Rdms Marks ");
	     Rdms=sc.nextFloat();
	     
	     total=java+php+syspro+Network+Csharp+Rdms;
	     System.out.println(" Your Total Subject Marks ===  " +total);
	     return total; //return total to Percentagemarks()
}
	public void Percentagemarks() 
	{ 
		double percentage,total;
		total=Totalmarks(); /// call to Totalmarks()
		percentage = total/6;	
	    System.out.println(" Your Percentage === " +percentage+"%");  	     
	}

}
