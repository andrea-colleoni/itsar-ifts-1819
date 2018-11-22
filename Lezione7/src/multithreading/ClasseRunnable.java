package multithreading;

public class ClasseRunnable implements Runnable {

	@Override
	public void run() {
		try {
			long millis = System.currentTimeMillis();
			System.out.println("operazione 1...");
			Thread.sleep(500);
			System.out.println("operazione 2...");
			Thread.sleep(500);
			System.out.println("operazione 3...");
			Thread.sleep(500);
			System.out.println("operazione 4...");
			System.out.println(System.currentTimeMillis() - millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
