package arrays;

public class ArrayExample22 {
//--------------right rotate-----------
	public static void main(String[] args) {
		int num[]= {12,20,32,30,5,3};
		int n=num.length;
		int rrot_point=2;
		int nn=n-rrot_point;
		int temp[]=new int[nn];
		for(int i=0;i<nn;i++) {
			temp[i]=num[i];
		}
		for(int i=nn;i<n;i++ ) {
			num[i-n+rrot_point]=num[i];
			
		}
		for(int i=0;i<nn;i++) {
			num[i+rrot_point]=temp[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
