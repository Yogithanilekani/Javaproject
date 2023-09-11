import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i =0;i<=10;i++) {
			System.out.println("print"+i);
		}
//		Thread.sleep(5000);checked exception
//		 TODO Auto-generated method stub
//		try {
//			Thread.sleep(5000);
//		}catch(Exception e){
//			throw new MyException();
//			
//		}
		System.exit(0);
//		Thread.sleep(6000);
		
	}

	public static void main(String[] args) throws InterruptedException, MyException {
		MyThread t1= new MyThread();
//		t1.run();
//		implementing using runnable
//		new state
		Thread thr = new Thread(t1);
//		
//		thr.start();
		ExecutorService exe = Executors.newFixedThreadPool(10);
		exe.submit(thr);
		Thread.sleep(6000);
		try {
			Thread.sleep(5000);
		}catch(Exception e){
			throw new MyException();
			
		}
		
		new Thread(()->{
			System.out.println("hi");
		}).start();
		
		

}
}
