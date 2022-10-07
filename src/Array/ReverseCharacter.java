package Array;
import java.util.Scanner;

public class ReverseCharacter {
//  System.out.println( "  ");  ()  ===>  {}  : : >=  <=   <   >  ||
	
	public static void main(String args[]){ 
    Scanner sc=new Scanner (System.in);
    int count=0;
    char ch[]=new char[5];
    System.out.println( " How Many Character stored into array ");
    int num=sc.nextInt();
    int len=ch.length;
    
    System.out.println( " Enter Your Character Of Array ");
    for  (int i=0;i<num;i++)
    {
    	ch[i]=sc.next().charAt(0);
    }
    
    System.out.println( " Your Character Of Array Element ");
    for (int i=0;i<num;i++) 
    {
    	if (ch[i]=='I')
    	 {
    		count++;
    	 }	
    		
    		
    	System.out.println( "  "+ch[i]+"  "+count);
    
    } 
    
    System.out.println( " Reverse Character Array Are ===>  ");
    {
    	for (int i=num-1;i>=0;i--)
    	{
    		System.out.println( "  "+ch[i]);
    		
    	
    	}
    	
    	System.out.println( "Length Of Array   ===> "+len);
    }
    
  }
}
