package InheritancePloy;

public class Overriding extends MainMethodClass {

	public void rectangle()
	{ 
		int l=15,b=9,Area;
	  Area=l*b;
	  System.out.println("Rectangle Area ==>  " +Area); 
	}
	
	
	public void circle()
	{
	 int r=6;
	 double circlearea=3.142*r*r;
	 System.out.println(" Area Of Circle ==>  " +circlearea);
	}
	
	public void square()
	{
		int a=9;
		int sqaure=a*a;
		System.out.println(" Area Of square ==>  " +sqaure);
	}
}
