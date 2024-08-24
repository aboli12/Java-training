package com;

import java.util.stream.Stream;

public class StreamPrimitiveArray {

	public static void main(String[] args) {
		//Stream<Integer> ss = Stream.of(10,20,30,40,50,60);
		//System.out.println(ss);
		//ss.forEach(c->System.out.println(c));
		// Stream.of(10,20,30,40,50,60).forEach(c->System.out.println(c));
		Integer num[]= {10,11,20,21,30,35,40,57,50,60,65};
		//Stream.of(num).forEach(c->System.out.println(c));
		//Stream.of(num).map(v->v+1).forEach(c->System.out.println(c));
		Stream.of(num).filter(p->p%2==0).forEach(c->System.out.println(c));
	}

}