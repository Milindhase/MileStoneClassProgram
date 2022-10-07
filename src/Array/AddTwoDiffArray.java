package Array;
import java.util.Scanner;

public class AddTwoDiffArray {
	
 public static void main(String args[]){ 
	//System.out.println( "  ");  ()  ===>  {}  : : >=  <= %
	//Que. 3)Write java program to take any two arrays e.g. a[ ] and b[ ] having size n. And add their values in another array c[ ].
	 
	 int a[]=new int[10];
	 int b[]=new int[10];
	 int c[]=new int[10];
	 Scanner sc=new Scanner(System.in);
 
	 System.out.println( "Enter Your Number Store in Array  A==>  ");
	 int num1=sc.nextInt();
	 
	 System.out.println( "Enter Your Number Store in Array  B==>  ");
	 int num2=sc.nextInt();
	 
	 System.out.println("Enter the elements of the Array A: ");
	 for(int i=0;i<=num1-1;i++)
		 a[i]=sc.nextInt();
	 
	 System.out.println("Enter the elements of the Array B: ");
	 for(int i=0;i<=num1-1;i++)
		 b[i]=sc.nextInt();
	 
	 System.out.println("OutPut Of Array C ");
	 for(int i=0;i<=num1-1;i++)
	 {
		 c[i]=a[i]+b[i];
		System.out.println(+c[i]); 
	 }	 } 
}