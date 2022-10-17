package arrays;

public class ArrayExample8 {
//---------------------------Linear search------------------------------
	public static void main(String[] args) {
	
		Vehicle v1=new Vehicle(123,"suzuki",2345.54,"red");
		Vehicle v2=new Vehicle(216,"BMW",23425.982,"blue");
		Vehicle v3=new Vehicle(324,"vittara brezza",12345.243,"green");
		Vehicle v4=new Vehicle(485,"Kia",32345.745,"black");
		 Vehicle a[]= {v1,v2,v3,v4};
		 int id=123;
		 boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(a[i].getvNumber()==(id)) {
				found =true;
				System.out.println(a[i].toString());
			}
		}
		if(!found) {
			System.out.println("vehicle number not found");
		}
		}
		

}
