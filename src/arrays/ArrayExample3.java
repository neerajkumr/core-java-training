package arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
		//Bubble sort
		int arr[]= {4,3,7,22,34,1,5};
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if (arr[j+1]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp; 
				}
			}
			}

		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");


	}
}
