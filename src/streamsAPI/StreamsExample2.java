package streamsAPI;

import java.util.HashSet;
import java.util.Set;

import functionalandlambda.Address;

public class StreamsExample2 {

	public static void main(String[] args) {
		Set<Address> set=new HashSet<>();
		
		set.add(new Address(1, "nallur", "agra", "delhi"));
		set.add(new Address(3, "metur", "mumbai", "maharastra"));
		set.add(new Address(2, "dinur", "vizag", "AP"));
		set.add(new Address(4, "KPHB", "hydrabad", null));
		
		boolean b = set.parallelStream().filter(f->f.getState()!=null).allMatch(a->a.getCity().equals("vizag"));
		if(b) {
			System.out.println("city name is same");
		}
		else {
			System.out.println("city name is not same");
		}
		boolean b1 = set.parallelStream().filter(f->f.getState()!=null).filter(f->f.getState().equals("maharastra")).anyMatch(a->a.getStName().equals("KPHB"));
		if(b1) {
			System.out.println("State matches with city");
		}
		else {
			System.out.println("nothing matches with the coresponding street name");
		}
		boolean b3 = set.parallelStream().filter(f->f.getState()!=null).noneMatch(a->a.getCity().equals("gra"));
		if(b3) {
			System.out.println("nothing matches with the provided city");
		}
		else {
			System.out.println("matches with the provided city");
		}
	}

}
