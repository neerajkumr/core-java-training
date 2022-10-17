package arrays;

public class ArrayExample5 {

	public static void main(String[] args) {
//selection sort
		int[] arr= {22,10,5,-44,78,25,-1,1};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int min_Ind=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[min_Ind]>arr[j])
				{
					min_Ind=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_Ind];
			arr[min_Ind]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	}


