package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetE {

	public static void main(String[] args) {
	Set<Integer> s=new HashSet<>();
	s.add(3);
	s.add(2);
	s.add(3);
	s.add(8);
	s.add(1);
	s.removeIf((a)->a<2);
	
	Iterator<Integer> it= s.iterator();
	if(it.hasNext()) {
		System.out.println(it.next());
	}
	
	Set<Product> p=new TreeSet<>();
	p.add(new Product(70,"vivo",4,2412.12));
	p.add(new Product(1,"realme",3,4412.12));
	
	for(Product p1:p)
	System.out.println(p1);
	}

	

}
