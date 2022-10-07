package Array;
import java.util.Scanner;
public class TwoDimentionalArray
{	//System.out.println( "  ");  ()  ===>  {}  : : >=  <=
//Que. 1) Write a java program to take any 2x2 matrix of integer values. But display Output such that Row and column positions will interchanged.
	public static void main(String args[]){ 	 
		int arr[][]=new int [2][2];
		Scanner sc=new Scanner (System.in);
		
		System.out.println( "Enter Your 3D Array Element ===> ");
		for(int i=0;i<2;i++) 			
		{
			for(int j=0;j<2;j++) 
			{
				arr[i][j]=sc.nextInt();
			}
		}	
		
		System.out.println( "Your 2D Input Array Element ===> ");	 
			for(int i=0;i<2;i++) 	
		 {    
				 for(int j=0;j<2;j++)
			{
				System.out.print( "   "+arr[i][j]);			
			}
			System.out.println( "  ");
		}		
		
		System.out.println( "Your 2D Output Array Element ===> ");
		for(int j=0;j<2;j++)  
			
		{
			for(int i=0;i<2;i++) 	
			{
				System.out.print( "   "+arr[i][j]);			
			}
			System.out.println( "  ");
		}
		
		
		}
	}