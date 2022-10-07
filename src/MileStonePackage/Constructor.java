package MileStonePackage;

public class Constructor {
		
		int a;
		float units,bill;
		
		
		public  Constructor()
		{
			// *Using constructor without parameter.
			units=30;
			bill=units*12;
			System.out.println("Monthly electricity bill of your home === " +bill);
		}
		
		public  Constructor(float u)
		{
			//*Using constructor with parameters
			units=u;
			bill=units*12;
			System.out.println("Monthly electricity bill of your home === " +bill);
			//bill=units*12rupees;
			}
		
		public  static void main(String ags[])
		{
			Constructor c=new Constructor();
			Constructor obj=new Constructor(40.0f);
			
	    }	
	

}
