package MileStonePackage;

public class ChildClassAbstract extends AbstarctClass
{//  System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "
	public static void main(String args[]){ 
		ChildClassAbstract cc=new ChildClassAbstract();
		cc.multiplication();
		
		int a=cc.addition(10,20);
		float b=cc.substraction();
		
		System.out.println("Non-static method called to addition abstract method===   "+a);
		System.out.println(" Non-static method called to substraction abstract method===    "+b);
	}
	
	public int addition(int a,int b)

	{
		//int a=10;
		//int b=20;
		int c=a+b;
		return c;
	}
	
	public  float substraction()
	{
		float d=50.2f;
		float e=20.6f;
		
		float f=d-e;
		return f;
	}
	
	public void multiplication()
	{
		int a=20;
		int b=30;
		int c=a*b;
		System.out.println(" Multiplication Of Non-static method =="+c);
		
		//int d=addition();
		// System.out.println("Non-static method called to addition abstract method===  "+d); 
		 
		 
		 //float g=substraction();
		 
		// System.out.println("Non-static method called to substraction abstract method===    "+g);
	}
	
	
}