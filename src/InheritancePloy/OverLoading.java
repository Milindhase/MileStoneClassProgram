package InheritancePloy;

public class OverLoading {
	

	//Que. 2) Write java program to implement Polymorphism to display area of rectangle, circle and square using
	// (a) Method Overloading (b) Method Overriding         ///  System.out.println(" ");  ()  { } ====>	 " "
	
	public static void main(String args[])
	{
		OverLoading o=new OverLoading();  // All Overloded Method Call Here With Using Class Object
		o.rectangle();
		o.rectangle(12,10);
		o.circle();
		o.circle(7);
		o.square();
		o.square(8);	
	}

	public void rectangle()
	{ 
		int l=10,b=20,Area;
	  Area=l*b;
	  System.out.println("Rectangle Area ==>  " +Area); 
	}
	
	public void rectangle(int l,int b)
	{
		int Area=l*b;
		System.out.println("Rectangle Area ==>  " +Area);
	}
	
	public void circle()
	{
	 int r=5;
	 double circlearea=3.142*r*r;
	 System.out.println(" Area Of Circle ==>  " +circlearea);
	}
	
	public void circle(int r)
	{
		 double circlearea=3.142*r*r;
		 System.out.println(" Area Of Circle ==>  " +circlearea);
	}
	
	public void square()
	{
		int a=6;
		int sqaure=a*a;
		System.out.println(" Area Of square ==>  " +sqaure);
	}
	
	public void square(int num)
	{
		int sqaure=num*num;
		System.out.println(" Area Of square ==>  " +sqaure);
	}
}
