package arrays;

public class ArrayExample9 {
//Merge 2 arrays
	public static void main(String[] args) {
		int src1[] = {10, 20, 30, 40, 50};
		
	      int src2[] = {9, 18, 27, 36, 45};
	      int total=src1.length+src2.length;
	 int newArr[]=new int[total];
	    for(int i=0;i<src1.length;i++) {
	    	newArr[i]=src1[i];
	    }
	    for(int i=0, j=src1.length ; j<total; i++,j++) {
	    	newArr[j]=src2[i];
	    }
	    for(int i=0;i<total;i++) {
	    	System.out.print(newArr[i]+" ");
	    }
	}

}
