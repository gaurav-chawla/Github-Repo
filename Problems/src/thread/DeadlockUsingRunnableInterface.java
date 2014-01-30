package thread;

public class DeadlockUsingRunnableInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		Thread t1 = new Thread(new SyncThread(o1,o2), "t1");
		Thread t2 = new Thread(new SyncThread(o2,o1), "t2");
		t1.start();
		t2.start();
	}

}

class SyncThread implements Runnable{
	
	final Object res1;
	final Object res2;
	
	SyncThread(Object o1, Object o2){
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
