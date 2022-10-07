package Collection;
import java.util.Vector;
import java.util.*;
import java.util.Iterator;

public class Vectorclass {

//  System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
    public static void main(String [] areg)
 {
    	Vector v1=new Vector();  //Vector Declaration
    	//1. Add elements 
    	v1.add(10);    
    	v1.add(45.63);
    	v1.add("Automation");
    	v1.add('A');
    	v1.add(-26);
    	System.out.println("\n 1. Add elements Vector Data==> "+v1); 
    	
    	//2. Remove any element
    	v1.remove(3);  
    	System.out.println("\n 2. Remove Vector Data==> "+v1); 
    	
    	//3. Replace any Element
    	v1.set(1, 856.663);
    	System.out.println("\n 3. Replace Vector Data==> "+v1);
    	
    	//4. Find size of elements
    	int len=v1.size();
    	System.out.println("\n 4. Find size of elements Vector==> "+len);
    	
    	//5. Display Elements using for loop
    	System.out.println("\n 5. Display Elements using for loop ");
    	for(int i=0;i<len;i++)
       {
    		System.out.println("   "+v1.get(i));
    	}
    	 //6. Display Elements using for each loop
    	System.out.println("\n 6. Display Elements using for each loop Vector ");
    	for(Object temp:v1)
    	{
    		System.out.println("    "+temp);
    	}
    	//7. Display Elements using while loop
    	System.out.println("\n 7. Display Elements using while loop Vector "); 
    	
    	Iterator obj=v1.iterator();
    	   while(obj.hasNext())
    	     {
                	System.out.println("     "+obj.next());
    	      }
   	
    	//8. Check List is empty or not
    	
    	System.out.println("\n 8. Check List is empty or not  Vector ===> "+v1.isEmpty());
    	//9. Check List contains any element
   
    	System.out.println("\n 9. Check List contains any element Vector ");
   	 if(v1.contains(-26))
   		 
   	      System.out.println("\n   List contains given data");
   		else
   	      System.out.println("\n   List do not contain given data");
   	 
 }
}  	
    	
    	
    	
    	
    	
  
