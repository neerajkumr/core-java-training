package functionalandlambda;

public class ThreadImpl{

	
	public static void main(String[] args) {
	//--------------------using Lambda Expressions-------------------------------
		FntInt f=(a,b)->{
			System.out.println((a+b));
		};
		f.sum(1, 9);

		//------------------------using anonymous class----------------------------
		FntInt f1 = new FntInt() {
			@Override
			public void sum(int i, double r) {
				
				System.out.println((i+r));
				
			}
			};
			f1.sum(2, 5);

//----------------Implementing Runnable Interface-----------------------------------
	Thread t= new Thread(()->{
		int p=0;
		for(int i=0;p<=i;i++) {
			 p=p+i;
			System.out.println(p);
		
		try {
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	});
	t.start();
	t.checkAccess();
	}
}