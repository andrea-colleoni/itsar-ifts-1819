package multithreading;

public class EsempioMultiThreading {

	public static void main(String[] args) throws InterruptedException {
		long millis = System.currentTimeMillis();
		ClasseRunnable cr = new ClasseRunnable();
		Thread t1 = new Thread(cr);
		t1.start();
		Thread t2 = new Thread(cr);
		t2.start();
		Thread t3 = new Thread(cr);
		t3.start();
		Thread t4 = new Thread(cr);
		t4.start();
		System.out.println("finito tutto! in " + (System.currentTimeMillis() - millis));
	}
	
	

}
