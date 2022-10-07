package MileStonePackage;
import java.util.Scanner;
public class GraduationMarks {

	
	public void displaygraduationmarks()
	{

		
		float java,php,syspro,Network,Csharp,Rdms,total, percentage;
		 Scanner sc =new Scanner(System.in);
		
		 System.out.println(" Non-Static Regular Method ");

		 System.out.println(" *************************************** "); 
		 
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
	     percentage = total/6;
	     System.out.println(" Your Total Subject Marks ===  " +total);
	     System.out.println(" Your Percentage === " +percentage+"%");  
	     
		 System.out.println(" *************************************** "); 
	}
}
