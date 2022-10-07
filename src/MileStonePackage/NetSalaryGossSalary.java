package MileStonePackage;
import java.util.*;

public class NetSalaryGossSalary {
	
	public static void main(String [] args)
	{
		NetSalaryGossSalary obj=new NetSalaryGossSalary();
		obj.displayNetandGrosssalary();				
	}
	public void displayNetandGrosssalary()
	{
		double gross,n,basic,netSalary;
	    Scanner sc=new Scanner(System.in);
	  	    
	     System.out.println("Enter Basic salary of the employee");
	      basic=sc.nextDouble();
	      gross=GrossSalary(basic);
	     System.out.println("The Gross salary of the employee is:" + gross + "\n");////Gross Salary Code	      
	     //System.out.println("Enter Gross salary"); // Net Salary Code
	     //basic=sc.nextDouble();
        n=NetSalary(basic);
      System.out.println("Net Salary is="+n);		
	}    
   public static double GrossSalary(double basic)
	{  System.out.println("*************** GrossSalary ****************************");
	   double da,hra,gross;
	   da=40*basic/100;
	   System.out.println("DA===>"+da);
	   hra=20*basic/100;
	   System.out.println("HRA===>"+hra);
	   gross= basic+da+hra;
	   System.out.println("********************************************");
	   return gross;
	  
    }
    public static double  NetSalary(double GS)
	{
    	System.out.println("************** Net Salary ******************************");
   	 double n,IT,PT,PF;
     	 PF=5*(GS/100);
     	System.out.println("HRA===>"+PF);
	     IT=7*(GS/100);
	     System.out.println("HRA===>"+IT);
	     PT=6*(GS/100);
	     System.out.println("HRA===>"+PT);
	     n=GS-IT-PT-PF;
	     System.out.println("********************************************");
	     return n;	  
	     
	}

}
