package Array;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections;


public class Descendingorder {
	
	final public static void main(String args[]){  
		// //System.out.println( "  ");  ()  ===>  {}  : : >=  <= %
	int a[]=new int[7];
	Scanner sc=new Scanner(System.in);
	
	System.out.println( "Enter How Many Number Stored into array ===>");
	int num=sc.nextInt();
	
	System.out.println( " Enter Array Element  ==> ");
	for(int i=0;i<7;i++)
	{	
			a[i]= sc.nextInt();
	}
	
	Arrays.sort(a);
	
	System.out.println( "Array Element Ascending Order==> ");
	for(int i=0;i<7;i++)
	{
		System.out.println( "  "+a[i]); 
	}	
	
	
	System.out.println( "Array Element Decending Order==> ");
	for(int i=7-1;i>=0;i--)
	{
		System.out.println( "  "+a[i]); 
	}
	

	{
		
	}
	
    }
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
