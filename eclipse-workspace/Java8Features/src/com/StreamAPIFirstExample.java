package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
class MyConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
	System.out.println(t);	
	}
}
public class StreamAPIFirstExample {

	public static void main(String[] args) {
	List<Integer> ll1 = new ArrayList<Integer>();
	ll1.add(20);ll1.add(10);ll1.add(60);ll1.add(80);ll1.add(100);
	System.out.println(ll1);
	System.out.println("Retrieve records using for each loop");
	for(int n:ll1) {
		System.out.println(n);
	}
	System.out.println("Retreive records using iterator");
	Iterator<Integer> li = ll1.iterator();
	while(li.hasNext()) {
		int n = li.next();
		System.out.println(n);
	}
	System.out.println("Retrieve the value using for each with consumer reference");
	Consumer<Integer> cc = new MyConsumer();
	ll1.forEach(cc);
	System.out.println("Retrieve the value using for each with consumer reference using lambda");
	ll1.forEach(c->System.out.println(c));
	}

}