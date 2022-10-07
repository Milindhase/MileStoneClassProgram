package Array;
import java.util.Scanner;
public class Revchar {
//  System.out.println( "  ");  ()  ===>  {}  : : >=  <=   <   >  ||
	
	public static void main(String args[]){ 
		Scanner sc=new Scanner(System.in);
		
		int ch[]=new int[5];
		System.out.println(" How Many Character You stored into Array  ");
		int num=sc.nextInt();
         int len=ch.length;
		
		System.out.println( "Enter Your Array Element  ");
		for(int i=0;i<=num-1;i++) 
		{
			ch[i]=sc.nextInt();
		}
		
		System.out.println( "Reverse Array Element Are  ");
		for(int i=num-1; i >=0;i--)
		  {
			 int square=ch[i]*ch[i];
			 
			 System.out.println( "  "+ch[i]+" ===> "+square); 
			 
			 
		  }	
	}
}