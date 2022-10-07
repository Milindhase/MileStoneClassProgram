package Collection;
import java.util.*;
import java.util.Iterator;


public class LinkedListclass {
//  System.out.println("  ");  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	
    public static void main(String [] areg)
 {
    	 LinkedList list = new LinkedList();
    	 list.add(50); //1. Add elements
    	 list.add(70);
    	 list.add(" Automation ");
    	 list.add('M');
    	 list.add(33.56);
    	 System.out.println("\n 1. Add elements LinkedList "+list);
    	 //2. Remove any element
    	 list.remove(2);
    	 System.out.println("\n 2. Remove any element LinkedList "+list);
    	 //3. Replace any Element
    	 list.set(1, 99.99);
    	 System.out.println("\n 3. Replace any Element LinkedList "+list);
    	 //4. Find size of elements
    	 int len=list.size();
    	 System.out.println("\n 4. Find size of elements LinkedList ===> "+len);
    	 //5. Display Elements using for loop
    	 System.out.println("\n 5. Display Elements using for loop LinkedList ");
    	 for(int i=0;i<len;i++)
    	 {
    		 System.out.println("  "+list.get(i));
    	 }	
    	 //6. Display Elements using for each loop
    	 System.out.println("\n 6. Display Elements using for each loop LinkedList ");
    	 for(Object temp:list) 
    	 {
    		 System.out.println("  "+temp); 
    	 } 
    	 //7. Display Elements using while loop
    	 System.out.println("\n 7. Display Elements using while loop LinkedList "); 
    	 Iterator obj1=list.iterator();
  	    while(obj1.hasNext())
  	     {
              	System.out.println("  "+obj1.next());
  	      }
  	    //8. Check List is empty or not
 	   	 
    	 System.out.println("\n 8. Check List is empty or not LinkedList ===> "+list.isEmpty()); 
    	 
    	 //9. Check List contains any element
    	 System.out.println("\n 9. Check List contains any element LinkedList ");
    	 if(list.contains(30))
    		 
    	      System.out.println("\n   List contains given data");
    		else
    	      System.out.println("\n   List do not contain given data"); 	 
    	 	 
     	 }
}

