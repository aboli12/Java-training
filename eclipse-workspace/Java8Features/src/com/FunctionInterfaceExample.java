package com;

import java.util.function.Function;

class MyFunction implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		return "You pass the number as "+t;
	}
}

public class FunctionInterfaceExample {

	public static void main(String[] args) {
		Function<Integer,String> f1 =new MyFunction();
		System.out.println(f1.apply(100));
		
		Function<Integer, String> f2 = (n)->"You pass number as "+n;
		System.out.println(f2.apply(200));
	}

}