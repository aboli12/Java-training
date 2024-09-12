package com;

import reactor.core.publisher.Flux;

public class FluxExample {

	public static void main(String[] args) {
			// 1st example 
//		Flux<Integer> mm	= Flux.just(1,2,3,4,5,6,7,8,9,10);			// backend 
//		// frontend 
//mm.subscribe(
//data-> {
//System.out.println(data);
//},
//error->{
//System.out.println(error);
//},
//()-> {
//System.out.println("done");
//}
//);
		
		// 2nd example 
		
		Flux<Integer> mm	= 
	Flux.just(1,2,3,4,5,6,7,8,9,10).concatWithValues(11).concatWith(Flux.error(new Error("Error generate"))).log();			// backend 
		// frontend 
mm.subscribe(
data-> {
System.out.println(data);
},
error->{
System.out.println(error);
},
()-> {
System.out.println("done");
}
);
	}

}