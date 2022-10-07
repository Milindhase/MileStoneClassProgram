package UpCasting;

public class ImplicitAndExplicit {
	
	public void implicitcasting ()                     ////System.out.println("  ");  ()  ===>  {}
	{
		int x=20;
		long y=x;
		
		long f=30;
		int g=(int) f;
		
		
		
		int a=50;
		double b=a;   //// implicit casting covert lower data type into higher data type
		System.out.println(" Value of int A  ===> " +a);
		System.out.println(" Value of Double B ===> "+b);
		// int size 4 byte convert into double size 8  byte
		
	}
	
	public void explicitcasting ()                     ////System.out.println("  ");  ()  ===>  {}
	{
	  double c=566.30;
	  int  d=(int)c;/// Explicit casting convert higher data type into lower data type
	  
	  System.out.println(" Value Of Double C  ===> " +c);
	  System.out.println(" Value Of Int D  ===>   "+d);
	  //double size 8 byte convert into int size 4 byte
	}
	public static void main(String args[])
	{
	
	ImplicitAndExplicit imp=new ImplicitAndExplicit ();
	imp.implicitcasting();
	
	imp.explicitcasting();
   }
}
 