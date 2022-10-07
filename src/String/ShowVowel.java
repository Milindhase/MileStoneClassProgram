package String;

public class ShowVowel {

	public static void main(String[] args) {
		
	//  System.out.println("  ");  "  "    "  " ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	 @ @	  _
		
		String s1="WelcomE";
		
		int size=s1.length();
	
		
		System.out.println("Length Of String   "+size);
		
		for(int i=0;i<size;i++) 
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||
					s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
			{
				System.out.println(s1.charAt(i));
			} 
		}	

	}

}
