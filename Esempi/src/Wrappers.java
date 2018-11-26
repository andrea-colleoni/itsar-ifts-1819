import java.util.Properties;

public class Wrappers {
	public static void main(String[] args) throws InterruptedException {
		boolean a = Boolean.valueOf("ewrerewrwe");
		System.out.println(a);
		Properties props = System.getProperties();
		
		for(Object k : props.keySet()) {
			Thread.sleep(500);
			System.out.println(k.toString() + ": " + props.getProperty(k.toString()));
		}
	}
}
