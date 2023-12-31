package com.referenceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/referenceinjection/refconfig.xml");
		A ta=(A)context.getBean("aref");
		System.out.println(ta.getX());
		System.out.println(ta.getOb().getName());
		System.out.println(ta);
	}

}
