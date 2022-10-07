package String;
import java.util.Scanner;

public  class StringProgram 
{   //   System.out.println( "  ");  ()  ===>  {}  : : >=  <=   <   >  ||
	//  int len=s2.length();
	//Que. 1) Write a java program to enter any String and display all the 'Vowels' present in it.
	
	public static void main(String args[]){ 
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println( "Enter Your String ");
		String s2=sc.nextLine();
		int len=s2.length();
	
		System.out.println( " Your String Vowels == ===> ");
		for (int i=0;i <=len-1;i++) 
		{
		if(s2.charAt(i) =='a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i)=='o'||s2.charAt(i)=='u'
		 ||s2.charAt(i) =='A' || s2.charAt(i) == 'E' || s2.charAt(i) == 'I' || s2.charAt(i)=='O'||s2.charAt(i)=='U'	)
			{
				System.out.print( "  "+s2.charAt(i));
			} 
				
		}	
		
	
}
}