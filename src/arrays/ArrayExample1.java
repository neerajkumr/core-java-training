package arrays;

import java.util.Scanner;

public class ArrayExample1 {

	private static void Sort(Integer[] arr) {
		
		
		for(int i=0;i<arr.length;i++) {        
			
			for(int j=i+1;j<arr.length;j++)  
			{
				int temp=arr[j];             
				if(arr[i]>temp) {
					arr[j]=arr[i];
				arr[i]=temp;                   
				}
				
			}
			
		}	
		System.out.println("After sorting as ascending order ");
		for(int a:arr) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		Integer n=s.nextInt();
		Integer array[]=new Integer[n];
		System.out.println("enter the array");
		for(int i=0;i<array.length;i++) {
		array[i]= s.nextInt();
		}
		Sort(array);
		s.close();
	}

	

}
