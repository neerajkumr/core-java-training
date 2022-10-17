package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapE3 {

	public static void main(String[] args) {
		int arr[]= {12,3,45,2,2,34,12,5};
		
		HashMap<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		 for(Entry<Integer,Integer> e: map.entrySet()) {
			 System.out.println("the freq of "+e.getKey()+" is "+e.getValue());
		 }
	}
}
