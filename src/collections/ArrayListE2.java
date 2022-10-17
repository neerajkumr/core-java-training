package collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListE2 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("ram");
		l1.add("raj");
		l1.add("rahul");
		
		List<String> l2=new ArrayList<>();
        l2.add("ram");
        l2.add("varun");
        l2.add("raj");
        
        
        for(String s:l1) {
        	if(l2.contains(s)) {
        		System.out.println("Duplicate element is "+s);
        	}
        	else {
        		System.out.println("Distinct element is "+s);
        	}
        }
	}

}
