package nospring;

public class A {
	
	void go() {
		B b = new B(); // tight coupling da risolvere con spring
		b.m();
		System.out.println("finito.");
	}

}
