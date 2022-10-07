package String;

public class PalindromString 
{
//  System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||   " "
	public static void main(String args[]){ 
		
		String s1="madaml";
		int len=s1.length();
		 char flag='n';
		for(int i=0;i<=len-1;i++)
		{
			char ch1=s1.charAt(i);
			char ch2=s1.charAt(len-1);
			
			if(ch1==ch2)
			{
				flag='y';
				
			}
			
			else
			{
				flag='n';
				   break;	
			}			
			len--;		
		}		
		
		if (flag=='y')
		 {
			System.out.println(" String Is Palindrom ");
		 }
		else
		{
			System.out.println(" String Is Not  Palindrom ");
		}
			
	
 }
}