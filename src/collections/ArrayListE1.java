package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListE1 {

	public static void main(String[] args) {
		
		List<String> l1= new ArrayList<>();
         l1.add("red");
         l1.add("green");
         System.out.println(l1);
         System.out.println(l1.indexOf("red"));
         l1.remove(0);
         System.out.println(l1);
         l1.add("blue");
         System.out.println(l1);
         l1.add(0, "black");
         System.out.println(l1);
         System.out.println(l1.get(1));
         //l1.set(3, "yellow");
         l1.add(3, "yellow");
         System.out.println(l1);
         
        if(l1.contains("Yellow")) {
        	 System.out.println(l1);
         }
        else {
        	System.out.println("not found");
        }
        Collections.sort(l1);
        System.out.println(l1);
        
		List<String> l2= new ArrayList<>();
         l2.add("12");
         l2.add("14");
         
         l1.addAll(l2);
         System.out.println(l1);
         
      Collections.copy(l1, l2);
      Collections.shuffle(l1);
      System.out.println(l1);
      Collections.reverse(l1);
      
     
      
      Iterator<String> i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
