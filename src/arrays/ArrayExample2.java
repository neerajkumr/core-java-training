package arrays;

public class ArrayExample2 {
//-----------Left rotate
	public static void main(String[] args) {
		int num[]= {12,20,32,30,5,3};
		int lrot_point=2;
		int temp[]=new int[lrot_point];
		for(int i=0;i<lrot_point;i++) {
			 temp[i]= num[i];	
			}
		for(int i=lrot_point;i<num.length;i++) {
			num[i-lrot_point]=num[i];
		}
		for(int i=0;i<lrot_point;i++) {
			num[i+num.length-lrot_point]=temp[i];
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		}
		

	}


