package String;
import java.util.Scanner;

public class CoutBackspaces {
//  System.out.println( "  ");  ()  ===>  {}  : : >=  <=   <   >  ||
//Que. 2) Write a java program to enter any sentence as a String and count the number of 'Blank Spaces' in it.
	
	public static void main(String args[]){ 
	Scanner sc=new Scanner (System.in);
	
	 System.out.println( " Enter Your String ");
	 String s1=sc.nextLine() ;
	 int len=s1.length();
	 int count=0;
	 
	 for(int i=0;i<= len-1;i++)
	 {
		 //char ch=s1.charAt(i);
		// if(ch==' ')   //
		 if  (s1.charAt(i)==' ') 
		 
			 count++;
		 
	 }	 	
	 System.out.println( " Your String Space Count ===> "+count);
	}
}