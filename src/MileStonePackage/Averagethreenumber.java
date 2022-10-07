package MileStonePackage;
import java.util.*;

public class Averagethreenumber {

	public  static void main(String []args)
	{	
		Averagethreenumber avg=new Averagethreenumber();
		avg.display();
		avg.display_areaof_triangle();		
	}	
    public void display()
    {
    	int i,n,sum=0,num;
    	double avg;
    	
    	Scanner sc =new Scanner(System.in);
    	System.out.println(" How many number Avrage you want ?==> ");
    	n=sc.nextInt();
    	System.out.println(" Enter Your number ");
    	for(i=1;i<=n;i++)	
    	
    	{     num=sc.nextInt();
    			sum=sum+num;
      	}  	
    	 avg=sum/n;
    	 System.out.println(" Avrage Of your Enter Number ====>  " +avg);   }
    
    public void display_areaof_triangle()
    {
    	int b,h;double area;
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter your base");
    	b = sc.nextInt();
    	System.out.println("Enter your Height");
    	h = sc.nextInt();
    	
    	 area=0.5*b*h;
    	 System.out.println("  Area Of Triangle  ===>>  " +area);
    }
	
}
