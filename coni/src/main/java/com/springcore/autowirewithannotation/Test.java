package com.springcore.autowirewithannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/springcore/autowirewithannotation/refconfig.xml");
	    Emp emp1 = (Emp) cont.getBean("emp1");
	    System.out.println(emp1);
	}

}
