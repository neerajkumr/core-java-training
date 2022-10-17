package arrays;

public class ArrayExample94 {

	public static void main(String[] args) {
			int arr[]= {12,3,45,2,2,34,12,5};
			 int []freq = new int[arr.length];  
			 int repeat=-1;
			for(int i=0;i<arr.length;i++) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
					count++;
					freq[j]=repeat;
				}
				}
					if(freq[i]!=repeat) {
						freq[i]=count;
					}
			}
			
			for(int i=0;i<freq.length;i++) {
			if(freq[i]!=repeat)
			System.out.println("the frequency of "+arr[i]+" is "+freq[i]);
			
			}
	}
}
