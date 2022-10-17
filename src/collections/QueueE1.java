package collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueE1{

	
	public static void main(String[] args) {
		
		Queue<Product> p=new PriorityQueue<Product>();
		Product p1=new Product(12,"samsung",5,2832.05);
		Product p2=new Product(13,"samsung",5,2832.05);
		Product p3=new Product(15,"nokia",8,4350.45);
		Product p4=new Product(11,"jio",2,12360.56);
		Product p5=new Product(9,"1+",1,1265.45);
		Product p6=new Product(45,"oppo",10,12324.34);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		
		for(Product pp:p) {
			System.out.println(pp);
		}
		System.out.println("------------retriving first node using peek--------------");
		System.out.println(p.peek());
		System.out.println("------------retriving and removing first node using poll--------------");
		System.out.println(p.poll());
		System.out.println("------------retriving first node using peek after using poll--------------");
		System.out.println(p.peek());
		
		System.out.println("-----------setting product id by checking if p1 contains the details-------");
		if(p.contains(p1)){
			p1.setpId(4);
			p.add(p1);
			System.out.println(p1);
		}
		
		System.out.println("-------priority queue with reverse order------------");
		
		//PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		PriorityQueue<Integer> pql=new PriorityQueue<Integer>((a,b)->(b-a));//using lambda expressions
		
		pql.add(12);
		pql.add(20);
		pql.add(51);
		pql.add(40);
		pql.add(4);
		
		for(Integer pq1:pql)
		System.out.println(pq1);
	}
	

}
