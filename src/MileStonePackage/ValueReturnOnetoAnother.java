package MileStonePackage;

public class ValueReturnOnetoAnother {
	
	public static void main(String args[]){ 
		//  System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "
		
	
		
		ValueReturnOnetoAnother obj=new ValueReturnOnetoAnother();
		
		int d=obj.add();
		obj.mul();
		System.out.println(" Addition === "+d);
		
		

  }
	

	public  int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	
	
	public void mul()
	{
		
	int a=10;
	int b=20;
	int c=a*b;
//	int d=add();
	
	//System.out.println(" Addition === "+d);
	
	System.out.println(" Multiplication === "+c);
	}
}