package arrays;

public class ArrayExample4 {

	public static void main(String[] args) {
		//insertion sort
		int arr[]= {22,10,5,44,78,25,1};
		int n = arr.length;
		for(int i=1;i<n;i++ ) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");

	}

}
