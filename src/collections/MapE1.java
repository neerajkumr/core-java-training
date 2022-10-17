package collections;

import java.util.HashMap;
import java.util.Map;

public class MapE1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m1=new HashMap<>();
		m1.put(1, "monkey d.luffy");
		m1.put(2, "roronoa zoro");
		m1.put(3, "god uusop");
		m1.put(4, "cat burgler nami");

		Map<Integer,String> m2=new HashMap<>();
		m2.put(5, "vinsmoke sanji");
		m2.put(6, "nico robin");
		m2.put(7, "chopper");
		
		
		m1.putAll(m2);
		//m1.clear();
		System.out.println(m1.isEmpty());//to check if map is empty r not
		
		
		for(Map.Entry<Integer,String> ent:m1.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}

		System.out.println(m1.get(6));//to get certain value associated with the key
		System.out.println(m1.keySet());//to get the key values in the map
		System.out.println(m1.values());//to get the values associated with the key in the map
		System.out.println(m1.size());
	}

}
