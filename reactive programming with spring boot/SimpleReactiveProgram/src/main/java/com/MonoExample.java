package com;

import reactor.core.publisher.Mono;

public class MonoExample {

	public static void main(String[] args) {
	// 1st example 	
//	Mono<String> mm	= Mono.justOrEmpty("Hello");
//	
//	mm.subscribe(data->System.out.println(data));
		
	// 2nd example 	
		Mono<String> mm	= Mono.justOrEmpty("Hello");			// backend 
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