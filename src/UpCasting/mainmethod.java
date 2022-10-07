package UpCasting;

public class mainmethod {

	public static void main(String args[])
	{
		System.out.println("creating chlid class object and call all method child and parent ");
		childclasscasting cc =new childclasscasting() ;
		cc.method1();
		cc.method2();
		cc.method3();
		cc.method4();  // creating class object and call all method
		System.out.println("**************************************************");
		
		System.out.println("creating parent class object and call method  parent ");
		UpcastingDownCasting uc=new UpcastingDownCasting ();
		uc.method1();
		uc.method2();
		System.out.println("**************************************************");
		
		System.out.println("************upcasting*****************************");
		UpcastingDownCasting upc =new childclasscasting();
		upc.method1();
		upc.method2();
		System.out.println("**************************************************");
		
		System.out.println("************downcasting*****************************");
		childclasscasting ccc=(childclasscasting) upc;
		ccc.method1();
		ccc.method2();
		ccc.method3();
		ccc.method4();
		System.out.println("*******************************************************");
		
		
	}
}
