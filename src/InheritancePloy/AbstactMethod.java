package InheritancePloy;
public abstract class AbstactMethod {
	
	//Que. 3) Write java program to implement abstract class concept in which take any two numbers and do its addition, substraction, 
	//multiplication and division. (Take any two methods as complete and other two as in-complete)
	  ///  System.out.println(" ");  ()  { } ====>
	
	protected abstract void addition();    // abstract method  addition() declare here // in-complete method
	protected abstract void substraction();    // abstract method  substraction() declare here // in-complete method
	
	public void multiplication() // complete method 
	{ 
		int a=10,b=15;
		int mul=a*b;
		System.out.println(" Complete Method Multiplication ==>  " +mul); 
		}
	
	public void division()  // complete method 
	{ 
		int a=50,b=5;
		int div=a/b;
		System.out.println("Complete Method  Division ==>  " +div); 
	}	
	

}

// we can not declared abstract method is private,final,static
// We can declared abstract method is public and protected.
// by default method in abstract class is public.

