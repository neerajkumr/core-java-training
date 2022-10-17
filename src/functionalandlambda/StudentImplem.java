package functionalandlambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.*;



public class StudentImplem  {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(2, "ravi", "o+ve" , new Address(21, "vs street", "banglore", "karnataka")));
		list.add(new Student(1, "vel", "b+ve" , new Address(21/12, "pg nagar", "chennai", "")));
		list.add(new Student(4, "prem", "o-ve" , new Address(12/6, "KPHB", "Hydrabad", "telangana")));
		list.add(new Student(3, "neeraj", "o+ve" , new Address(45/5, "tirupathi nagar", "tirupathi", "andra")));

		list.forEach((l)->{
			if(l.getAddress().getState().isEmpty()) {
				l.getAddress().setState("Tn");
				 System.out.println(l.getAddress());
				 System.out.println();
			}
		  
	//	System.out.println(l.getAddress().getStName());
		
		});
		
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getName().compareTo(o2.getName());
				 
			}
		});
		
		for(Student s:list) {
			System.out.println(s);
		}
		
//consumer functional interface
	Consumer<Student> consume=(s)->{
		System.out.println(s.getName());
	};
	consume.accept(list.get(0));
	
	//BiConsumer
	BiConsumer<Student,Address> consume1=(s1,s2)->{
		System.out.println(s1.getName().compareToIgnoreCase(s2.getState()));
	};
	
	consume1.accept(list.get(2), list.get(2).getAddress());
	
	//predicate

	Predicate<Student> pre =(p)->{
		System.out.println(p.getsId()==2);
		return true;
		
	};
	pre.test(list.get(0));
	
	
	//function
	
	Function<Address,Student> fnt=(in)->{
		return new Student(12, "phanmantu", "0-ve", in);
	};
	System.out.println(fnt.apply(new Address(61, "MGR salai", "chennai", "tamil nadu")));
	
	//supplier
	Supplier<Double> sup =()-> Math.random();
		System.out.println(sup.get());
		
}
	}