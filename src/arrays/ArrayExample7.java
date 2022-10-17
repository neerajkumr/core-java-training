package arrays;

import java.util.Arrays;

public class ArrayExample7 {

	//Binary search
		public static void binarySearch(int arr[], int l, int r, int key){
			   int mid = (l + r)/2;
			   while( l <= r ){
			      if ( arr[mid] < key ){
			        l = mid + 1;
			      }else if ( arr[mid] == key ){
			        System.out.println("Element is found at the index: " + mid);
			        break;
			      }else{
			         r = mid - 1;
			      }
			      mid = (l + r)/2;
			   }
			   if ( l > r ){
			      System.out.println("Element is not found!");
			   }
			 }
			 public static void main(String args[]){
				
					int arr[]= {22,10,5,44,78,25,1};
					Arrays.sort(arr);//1,5,10,22,25,44,78
					int key = 22;
			        int last=arr.length-1;
					binarySearch(arr,0,last,key);	
			 }
			
		
	}


