package String;

import java.util.Scanner;

public class PracticeProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	// System.out.println("  ");  "  "    "  " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	 @   @	  _
	/*	
		for(int i=1;i<=10;i++)
		{
			//for(int j=1;j<=10;j++)
				
			//{
				//System.out.print("  "+i*j);
				System.out.println("  "+i*i*i);
			//}
			
			
		}	
			System.out.print("  ");
		*/
		// To check number is palindrom or not
		
	/*
		System.out.println("Enter Your Number");
		int num=sc.nextInt();
		
		//int num=991;
		int temp=num;
		int sum=0;
		int rem=0;
		 while(num>0)
		 {
			 rem=num%10;
			 sum=sum*10+rem;
			 num=num/10;
			 
		 }
			 
		 if(sum==temp)
		 {
			 System.out.println("Number IS palindrom");
		 }	 
		 
		 else
		 {
			 System.out.println("Number is  not palindrom"); 
		 }
		
*/
		
		//  To  check number is prime or not
/*	  int num=12;
	  int count=0;
	  for(int i=2;i<num; i++)
	  {
		  if(num%i==0)
		  {
			  count++;
			  break;
		  }
	  }  
	  if (count==0)
	  {
		  System.out.println("Number is prime");
	  } 
	  
	  else
		  
	  {
		  System.out.println("Number is not prime");
	  }
	  */
		
	/*	int num=254;
		int rev=0; int rem=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}	
		System.out.println("Reverse Number   "+rev);*/
		
		
		/*int num[]={10,15,12,17,18,62,33};
		int len=num.length;
		
		int even[]=new int [6];
		int odd[]=new int[6];
		
		for(int i=0;i<len-1;i++)
		{
			 
			if(num[i]%2==0)
			{
				System.out.println("Even Number");
				System.out.println(num[i]);
			}
			
			else
			{System.out.println("odd Number");
				System.out.println(num[i]);
			}
		}	
		
		
		/* for(int i=0;i<len-1;i++)
		 {
			 System.out.println(even[i]);
		 }	 
			
		 System.out.println("odd Number");
		 for(int i=0;i<len-1;i++)
		 {
			 System.out.println(odd[i]);
		 }*/
		
		/*	 // To check  string is palindrom or not
		String a= "nayan";
		String b="";
		
		int len=a.length();
		for(int i=len-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		//System.out.println(b);
		
		if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }*/
		
		// To check repeat character in the string
		
		/*String str="rannieyoi";
		int len=str.length();
	
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j)) 
					System.out.println(str.charAt(i));
		}
			
  }	*/	
	//to remove repeated character in the string
/*	String s1="Milind";
	String s2=s1.replace("i", "");	
	System.out.println(s2);	
	*/
	/*	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  *  ");
			}
			
			System.out.println("  ");
		}	
		*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("  ");
			}
			
			System.out.println("  ");
			
			
				
		}
		
		System.out.print("  *  ");
		
			
	// System.out.println("  ");  "  "    "  "    ()  ===>  {}  : : >=  <=   <  >     ||     " "   >   <  %	 @   @	  _
			
	}

}






















