package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class DemoSpel {
	@Value("#{25+60}")
	private int a;
	@Value("#{6+10}")
	private int b;
	@Value("#{T(java.lang.Math).PI}")
	private double c;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double d;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "DemoSpel [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	 

}