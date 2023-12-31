package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		/* This work as init method */
		System.out.println("Inside init method of pepsi");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		/* This work as destroy method */
		System.out.println("Inside destroy method of pepsi");
		
	}
	
}
