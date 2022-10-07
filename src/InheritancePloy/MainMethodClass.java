package InheritancePloy;

public class MainMethodClass {
	
	public void rectangle()
	{ 
		int l=10,b=20,Area;
	  Area=l*b;
	  System.out.println("Rectangle Area ==>  " +Area); 
	}

	public void circle()
	{
	 int r=5;
	 double circlearea=3.142*r*r;
	 System.out.println(" Area Of Circle ==>  " +circlearea);
	}
	
	public void square()
	{
		int a=6;
		int sqaure=a*a;
		System.out.println(" Area Of square ==>  " +sqaure);
	}
	
	public static void main(String args[])
	{
		Overriding o=new Overriding();  // create child class object and call method
		o.rectangle();   // if create child class object that time call only child class method  hide base class method 
		o.circle();      // means child class call only self method not call parent method
	    o.square();				
	}
}
