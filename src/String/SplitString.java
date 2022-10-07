package String;
import java.util.Scanner;
public class SplitString {
	

public static void main(String []args)
{
//  System.out.println(" ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "  ||
	// Split String reverse
	 Scanner sc=new Scanner (System.in);
		System.out.println("Enter Your String ");
		String s1=sc.nextLine();
					
	    String arr[] = s1.split(" ");
	    int len=arr.length;
	    for (int i=0;i<=len-1;i++)
	    {
	      System.out.println(arr[i]);
	    }
  }
}