package arrays;

public class ArrayExample93 {
//--------------------------Quick sort---------------------------

public static void quickSort(int[] arr,int low,int high)
		{
			if(low>=high)
			{
				return;
			}
			int pivot=high;
			int lp=low;
			int rp=high-1;
			while(lp<rp)
			{
				while(arr[lp]<= arr[pivot]&& lp<rp)
				{
					lp++;
				}
				while(arr[rp]>=arr[pivot] && lp<rp)
				{
					rp--;
				}
				swap(arr,lp,rp);
			}
			swap(arr,lp,pivot);
			quickSort(arr,low,lp-1);
			quickSort(arr,lp+1,high);
		}
		
public static void swap(int[] arr, int i,int j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
public static void printValues(int[] arr){
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		public static void main(String[] args) {
			int[] arr= {4,3,7,22,34,1,5};
			int n=arr.length;
			System.out.println("Before sort");
			printValues(arr);
			quickSort(arr,0,n-1);
			System.out.println("After sort");
			printValues(arr);
		}



	}


