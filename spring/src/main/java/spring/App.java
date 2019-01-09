package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@Autowired
	A a;

	public static void main(String[] args) {
		/*
		A a = new A();
		B b = new B();
		a.b = b;
		*/
		// avvio spring
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		App app = ctx.getBean(App.class);
		app.go();
	}
	
	void go() {
		a.go();
	}

}
