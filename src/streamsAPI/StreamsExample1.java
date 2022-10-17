package streamsAPI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import functionalandlambda.Address;
import functionalandlambda.Student;

public class StreamsExample1 {

	public static void main(String[] args) {
		
			List<Student> q=new ArrayList<>();
			q.add(new Student(7, "raj", "A-ve" , new Address(13, "BTM", "banglore", "karnataka")));
			q.add(new Student(7, "abi", "A+ve" , new Address(5, "Thendral nagar", "Theni", "TN")));
			q.add(new Student(2, "ravi", "o+ve" , new Address(21, "vs street", "banglore", "karnataka")));
			q.add(new Student(1, "vel", "b+ve" , new Address(21/12, "pg nagar", "chennai", "")));
			q.add(new Student(4, "prem", "o-ve" , new Address(12/6, "KPHB", "Hydrabad", "telangana")));
			q.add(new Student(3, "neeraj", "o+ve" , new Address(45/5, "tirupathi nagar", "tirupathi", "andra")));
			
		q.stream().filter((fil)->fil.getName().startsWith("r", 0))//r is the char to look ---0 is the position to look
			.forEach((l1)->System.out.println(l1));
		long start = System.nanoTime();
		
		List<String> ls=q.parallelStream().map(Student::getbGroup).collect(Collectors.toList());
		ls.forEach(l->System.out.println(l));
		
		long end = System.nanoTime();
		
		System.out.println(end-start);
		/*using lambda we have 
		 * 
		 * Student(s->s.getbGroup());
		 * 
		 * using method reference short form of lambda
		 * 
		 * Student::getbGroup  
		 * */
		long start1 = System.nanoTime();
		List<String> ls1=q.stream().map(Student::getbGroup).collect(Collectors.toList());
		ls1.forEach(l->System.out.println(l));
		
		long end1 = System.nanoTime();
		
		System.out.println(end1-start1);
		System.out.println("===================Door number sort=============== ");
		q.stream().sorted((a1,a2)->a1.getAddress().getdNo()-a2.getAddress().getdNo())
		.forEach(p->System.out.println(p));
		
		
		System.out.println();
		System.out.println("===================student id sort=============== ");
		q.stream().sorted(Comparator.comparing(Student::getsId).reversed())
		.forEach(p->System.out.println(p));
		
		
		System.out.println("===================student list limiting=============== ");
		q.stream().limit(3).collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("===================Printing name which has a distinct state=============== ");
		q.stream().map(s->s.getAddress().getState()).distinct().skip(0).forEach(s->System.out.println(s));

		 
	}

}
