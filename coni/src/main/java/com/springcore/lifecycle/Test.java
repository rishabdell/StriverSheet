package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/refconfig.xml");
//        Samosa q= (Samosa) context.getBean("s1");
//        System.out.println(q);
//        
//        //registerShutdownHook ye wala method 
//        //AbstractApplicationContext me milega
      context.registerShutdownHook();//if you are using destroy method than this is compulsary
//        
//   
//        Pepsi p= (Pepsi) context.getBean("p1");
//        System.out.println(p);
	Example ex =(Example)context.getBean("e1");
	System.out.println(ex);
	}

}
