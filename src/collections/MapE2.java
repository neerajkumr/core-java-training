package collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapE2 {
// --------------------Duplicate elements-------------------------
	public static void main(String[] args) {

		 int[] arr = {1,1,1,1,1,2,3,3,4};
		 
		 int i=0;
	        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	        for(i=0;i<arr.length;i++) {
	            int count=0;
	            for(int j=0;j<arr.length;j++)
	            {
	                if(arr[i]==arr[j])
	                {
	                    count++;
	                }
	                
	            }
	            map.put(arr[i], count);
	        }
	        for(Entry<Integer,Integer> e: map.entrySet())
	        {
	        	if(e.getValue()>1)
	            System.out.println("duplicate values are "+e.getKey());
	        }

	}

}
