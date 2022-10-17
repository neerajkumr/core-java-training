package arrays;

public class ArrayExample81 {
	public static void heapify(int arr[],int n,int i)
	{
		int high=i;
		int left=i*2+1;
		int right=i*2+2;
		if(left<n && arr[left]>arr[high])
		{
			high=left;
		}
		if(right<n && arr[right]>arr[high])
		{
			high=right;
		}
		if(i!=high)
		{
			int temp=arr[i];
			arr[i]=arr[high];
			arr[high]=temp;
			heapify(arr,n,high);
		}
	}
	
	
	public static void heapsort(int[] arr)
	{
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
		
	}
	
	
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int arr[]= {32,54,67,43,23};
		System.out.println("Before sorting");
		print(arr);
		heapsort(arr);
		System.out.println("After sorting");
		print(arr);
		
	}



}
