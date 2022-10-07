package Array;
import java.util.Scanner;

public class DiagonalElement 
{//System.out.println( "  ");  ()  ===>  {}  : : >=  <=
	
	public static void main(String args[]){ 
		int k=0;
		Scanner sc=new Scanner(System.in) ;
		int arr[][]=new int [3][3];
	
		System.out.println( "Enter Your 3D Array Element ===> ");
		int num=sc.nextInt ();

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			 {	
				if(i==j)
					arr[i][j]=1;
				else
			   	arr[i][j]=0;					
			 System.out.print("  " +arr[i][j]);
				
			 }
			System.out.println( "  ");
					
		}			
  }
}