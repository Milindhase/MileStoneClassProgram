package InheritancePloy;

public class Vehicle { ////Base Class
	//Que. 1) Write a java program to implement Hierachical Inheritance using Base class as Vehicle and its child 
	//classes are like Car, Bike and Cycle. Further extend Class Car as CNG, Petrol, Electric and Diesel CARs. Display 
	//some text as output from all the methods from different classes.*/
	
	public void  Vehicle ()  ///  System.out.println(" ");  ()  { }
	{
		 System.out.println("This is Base Class Vehical");  
	}
	
	public static void main(String args[])
	{
		Car c=new Car(); // child class car created object and call base class and child 1 class  method
		c.Vehicle();
		c.CNG();
		c.Diesel();
		c.Electric();
		
		
		Bike b=new Bike();// child class Bike created object and call base class and child 2 class  method
		b.Vehicle();
		b.Petrol();
		b.Electric();
		
	
		Cycle C=new Cycle();// child class Cycle created object and call base class and child 3 class  method
		C.Vehicle();
		C.Oli();
	}
}
