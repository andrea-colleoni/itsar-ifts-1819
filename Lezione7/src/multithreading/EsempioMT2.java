package multithreading;

public class EsempioMT2 {

	public static void main(String[] args) {
		// implementazione in loco dell'interfaccia Runnable
		// => Anonymous inner class
		Thread t = new Thread(new Runnable() {
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
					e.printStackTrace();
				}
			}
		});
		// come lambda expression
		new Thread(() -> {
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
				e.printStackTrace();
			}
		}).start();

	}

}
