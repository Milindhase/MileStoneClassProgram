package Array;
import java.util.Scanner;
public class ArrayProgram 
{
	 //System.out.println( "  ");  ()  ===>  {}  : : >=  <=
	//Que. 1) Write a java program to display any 5 alphabets using character array.
	  public static void main(String args[])
	  {
		 Scanner sc=new Scanner(System.in);
		 char alpha[]=new char[10];
		 
		 System.out.println( "Enter Your Number Store in Array");
		 int num=sc.nextInt();
		 
		 System.out.println("Enter the Character of the Array: ");
		 
		 for(int i=0;i<=num-1;i++)
		 {
			alpha[i]=sc.next().charAt(0);
		 } 
		 
		 System.out.println("Display the Character of the Array: "); 
		 
		 for(int i=0;i<=num-1;i++)
		 {
			 System.out.print( "  "+alpha[i]);
		 } 		  
	  }	  
  }


