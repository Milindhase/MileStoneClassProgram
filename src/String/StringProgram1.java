package String;
import java.util.Arrays;
import java.util.Scanner;

public class StringProgram1 {
	public static void main(String args[]){ 
	//  System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "
		
		Scanner sc=new Scanner(System.in);	
		
		 String s1="madam";  String s2="lmadam";
		
			// System.out.println(s1.lastIndexOf("t"));		 
		 /*
		  Replace String  //   System.out.println(s1.replace('m', 'k')); 
		  String Upper Letter//System.out.println("\n Using Uppear case  ===>"+s1.toUpperCase()); 
		  String Lower Letter//System.out.println("\n Using Lower case  ===>"+s1.toLowerCase()); 
		  String Replace Space//  System.out.println(s1.replace('m', ' '));
		  String Is Empty//  System.out.println(s1.isEmpty ());
		  String Concatination  // 	 System.out.println(s1.concat(s2));
		  String End letter check // System.out.println(s1.endsWith("m")); Ans== True/False
		  String Start letter check // System.out.println(s1.startsWith("m")); Ans== True/False
		  String CharAt(0)  // System.out.println(s1.charAt(0));
		  Both String Equal Are Not //  if (s1.equals(s2))	
		  */
			//  System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "
			 
			 // Character Array Element Sort  Ascending order and descending order 
			 char ch[]=new char[6];	
			 int i;
			 System.out.println("Enter Your Array Element  ");
			 int len=ch.length;
			 for(i=0;i<=len-1;i++)
			 {
				 ch[i]=sc.next().charAt(0);// character get from end user function
			 }	
			 
			 Arrays.sort(ch);//array element sort function
		
			 // Character Letter sort Ascending order	in array	 
			 System.out.println("Your Array Element Are Ascending order ");
			 for(i=0;i<=len-1;i++)
			 {
				 System.out.println(ch[i]);
			 } 
			 
			// Character Letter sort descending order	in array	 
			 System.out.println("Your Array Element Are descending order ");
			 for(i=len-1;i >=0;i--)
			 {
				 System.out.println(ch[i]);
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
 }
}