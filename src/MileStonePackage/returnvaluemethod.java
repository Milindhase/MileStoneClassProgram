package MileStonePackage;

import java.util.Scanner;
public class returnvaluemethod {

	public  static void main(String []args)
	{
		
//Que. 2) Write java program to display Volume of cone by returning value from the method. (Hint: formula V=(0.333*3.142*r*r)/h ;
		double r,h,v;
		Scanner sc =new Scanner(System.in);
    	System.out.println(" Enter Value of R ==>  ");
    	r=sc.nextDouble();
    	System.out.println(" Enter Value of H ==> ");
    	h=sc.nextDouble();
    	
    	returnvaluemethod obj=new returnvaluemethod();
    	v=obj.displayVolumeofcone(r, h);
    	
    	System.out.println(" display Volume of cone  ==> "+v);

    }
	
	public double displayVolumeofcone(double r , double  h)
	{	
		double V;
		V=(0.333*3.142*r*r)/h ;
		return V;		
	}
}
