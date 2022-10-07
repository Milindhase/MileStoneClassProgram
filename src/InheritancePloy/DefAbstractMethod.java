package InheritancePloy;

public class DefAbstractMethod extends AbstactMethod {
	
	
	public void addition()
	{
		int p=50,q=60;
		int add=p+q;
		System.out.println(" Abstract Method Addition ==>  " +add);
	}

	public void substraction()
	{
		int p=90,q=23;
		int Sub=p+q;
		System.out.println("Abstract Method  Substraction ==>  " +Sub);
	}
	
	public static void main(String args[])
	{
		DefAbstractMethod a=new DefAbstractMethod();// create object child class
		a. addition();       //  call by Abstract Method
		a.substraction();   // call by Abstract Method
		
		a.multiplication();// call by compete method
		a.division();      //call by compete method				
	}

}
