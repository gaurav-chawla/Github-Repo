package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadlockUsingExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable worker = new SyncThread1(o1,o2);
		executor.execute(worker);
		
		worker = new SyncThread1(o2,o1);
		executor.execute(worker);
		
	}

}

class SyncThread1 implements Runnable{
	
	final Object res1;
	final Object res2;
	
	SyncThread1(Object o1, Object o2){
		res1=o1;
		res2=o2;
	}

	@Override
	public void run() {
		synchronized(res1){
			System.out.println("This is res1"+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (res2) {
				System.out.println("This is res2"+Thread.currentThread().getName());
			}
		}
	}
	
}
