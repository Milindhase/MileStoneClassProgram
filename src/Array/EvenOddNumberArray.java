package Array;
import java.util.Scanner;

public class EvenOddNumberArray {
	public static void main(String args[])
	 {
		 // //System.out.println( "  ");  ()  ===>  {}  : : >=  <= %
		//Que. 1) Write a java program to enter any 5 integer Array elements through user input and separate Even 
	//	and Odd numbers from them.
		Scanner sc=new Scanner (System.in);	
		int arr[]=new int[10];
		
		System.out.println( "Enter Your Number Store in Array ");
		int num=sc.nextInt();
		
		 System.out.println("Enter the elements of the Array: "); 
		for(int i=0;i<=num-1;i++)
		
		arr[i]=sc.nextInt ();
		
		
		System.out.println("Even Numbers:"); 
		for(int i=0;i<=num-1;i++)
		
			if(arr[i]%2==0)
	
				System.out.println( "  "+arr[i]);
			
		
		 System.out.println("Odd Numbers:"); 
		 for(int i=0;i<=num-1;i++)
		 
			 if(arr[i]%2!=0)
		
			System.out.println( "  "+arr[i]);
	   }
	}
