package com;
interface A {
	void dis1();
	default void dis2() {
		System.out.println("Default implementation dis2 method");
	}
	default void dis3() {
		System.out.println("Default implementation dis3 method");
	}
	static void dis4() {
		System.out.println("static method implementation");
	}
}
class Test implements A {
	@Override
	public void dis1() {
	System.out.println("provided body for dis1 method ie abstract");	
	}
	@Override
	public void dis2() {
		System.out.println("default method override by Test class ie dis2");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Test tt = new Test();
		tt.dis1();
		tt.dis2();
		tt.dis3();
		A.dis4();   // static method part of interface 8 version need to call using interface name 
	}
}