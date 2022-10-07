package MileStonePackage;
import java.util.*;


public class ParameterMethod {
	public  static void main(String []args)
	{
		int x,y,ans;
		
		Scanner sc =new Scanner(System.in);
    	System.out.println(" Enter Value of X ==  ");
    	x=sc.nextInt();
    	System.out.println(" Enter Value of Y == ");
    	y=sc.nextInt();
		
		ParameterMethod  obj=new ParameterMethod( );
		ans=obj.Remainder(x ,  y);    ///  ans=obj.Remainder(12 ,  7);                   
			System.out.println("Remainder of division ="+ans);
	
	}
	
	public int Remainder(int  x ,  int  y)
	{		
		int ans;
		
		ans=x%y;
			
	  return  ans;	
	}  

}
