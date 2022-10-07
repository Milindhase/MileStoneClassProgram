package Array;
import java.util.Scanner;
public class ArrayReverse 
{
 public static void main(String args[])
 {
	 // //System.out.println( "  ");  ()  ===>  {}  : : >=  <=
// Que. 2) Write java program to take any array with double data type values and display all values in reverse order of
//	 their index position (i. e. Last element should be displayed 1st in the output and so on) 
    
	 Scanner sc=new Scanner(System.in); 	 
	 double rev[]=new double[10];
	 System.out.println( "Enter Your Number Store in Array");
	 int num=sc.nextInt();
	 
	 System.out.println("Enter the elements of the Array: "); 
	 for(int i=0;i<=num-1;i++)
	 {
		 rev[i]=sc.nextDouble();
	 }	
	 System.out.println("Revers elements of the Array: "); 
	 for(int i=num-1;i>=0;i--)
	 {
		 System.out.println(rev[i]); 
	 }	  }}