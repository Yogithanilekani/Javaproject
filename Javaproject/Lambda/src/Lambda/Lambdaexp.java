package Lambda;

public class Lambdaexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInter inter = new MyInterImpl();
		inter.lambdafunction();
		
//		Using anonymous class for implementing interface
		myInter i = new myInter() {

			@Override
			public void lambdafunction() {
				System.out.println("hi yogi");
				
			}
			
		};
		i.lambdafunction();
		
//		using lambda expressions
		
		myInter usinglambda = ()->{System.out.println("hi yogi jiii");};
		usinglambda.lambdafunction();
	};
		
//		using lambda expressions for sumInterface
		sumInterface su = (a,b) -> a+b;
		sumInterface in = (a,b)-> a-b;
	
//		System.out.println(su.sum(5,6));
		
//		getLength gt = str -> {str.length();};
//		System.out.println(gt.getLengthofstring("hi"));
		
		Runnable thread1 =()->{
			for(int i=1;i<=10;i++) {
				System.out.println("value"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t1 = new Thread(thread1);
//		t1.start();
		
		
		
		

	

}
