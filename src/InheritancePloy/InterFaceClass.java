package InheritancePloy;

public class InterFaceClass implements abstractmethod {
	public void addition(){
		int p=25,q=240;
		int add=p+q;
		System.out.println(" Interface Method Addition ==>  " +add);
	}

	public void substraction()
	{
		int p=70,q=36;
		int Sub=p+q;
		System.out.println("Interface Method  Substraction ==>  " +Sub);
	}
	
	public void multiplication() // complete method 
	{ 
		int a=12,b=14;
		int mul=a*b;
		System.out.println(" Complete Method Multiplication ==>  " +mul); 
		}
	
	public void division()  // complete method 
	{ 
		int a=100,b=20;
		int div=a/b;
		System.out.println("Complete Method  Division ==>  " +div); 
	}	
	
	public static void main(String args[])
	{
	
		InterFaceClass IF=new InterFaceClass();
		IF.addition();
		IF.substraction();
		IF.multiplication();
		IF. division();
	
	}
}








