package Array;
import java.util.Scanner;
public class ThreeDimentional 
{//System.out.println( "  ");  ()  ===>  {}  : : >=  <=
// Write a java program to enter any two 3x3 matrix values through user input with Scanner class and display result of their subtraction.
	public static void main(String args[]){ 
		int arr[][]=new int[3][3];
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
	 
		System.out.println( " Enter Your 1 St Array Element ===> ");
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				{
					arr[i][j]=sc.nextInt();
				}
			}			}	
		System.out.println( " Enter Your 2nd  Array Element ===> ");
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				{
					arr1[i][j]=sc.nextInt();
				}  }		}
		 System.out.println( " OutPut Your 3rd  Array Element ===> ");
		 for(int i=0;i<3;i++)
			{
				for (int j=0;j<3;j++)
				{
					{
						arr2[i][j]=arr[i][j]-arr1[i][j];
						System.out.print( "  " +arr2[i][j]);
						
					}
				}	System.out.println( "  ");
			} 	 }}