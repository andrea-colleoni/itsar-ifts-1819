package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	@Autowired
	I i;
	
	void go() {
		i.m();
		System.out.println("finito.");
	}
}
