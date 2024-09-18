package com.tnsif.autowireanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c=new ClassPathXmlApplicationContext("autowireanno.xml");
		Human hum=c.getBean("hum",Human.class);
		hum.startPumping();

	}

}
