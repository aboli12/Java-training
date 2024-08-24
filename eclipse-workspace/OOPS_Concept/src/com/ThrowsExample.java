package com;

import java.sql.SQLException;

public class ThrowsExample {
	static void dis1() throws ArithmeticException{
		try {
		int a=100/0;
		}catch(NumberFormatException e) {}
		System.out.println("dis1 method");
	}
	static void dis2() throws Exception{
		try {
		dis1();
		}catch(ArithmeticException e) {}
		System.out.println("dis2 method");
	}
	public static void main(String[] args) throws Exception{
		//try {
		dis2();
		//}catch(Exception e) {}
	System.out.println("main method");
	}

}