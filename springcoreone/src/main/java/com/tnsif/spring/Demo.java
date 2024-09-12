package com.tnsif.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("Bean.xml");
		System.out.println("Application");
		Sim a=c.getBean(Airtel.class);
		a.calling();
		a.data();
		

	}

}
