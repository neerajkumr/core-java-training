package arrays;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		//linear array search
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		Integer n=s.nextInt();
		Integer arr[]=new Integer[n];
		System.out.println("enter the array");
		for(int i=0;i<arr.length;i++) {
		arr[i]= s.nextInt();
		}
		System.out.println("Enter the element to be found ");
		int element= s.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("the element found at index: "+i);
			}
		}
s.close();
	}

}
