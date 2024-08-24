package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListClasses {

	public static void main(String[] args) {
	// ArrayList 
//		List ll1  = new ArrayList();
//		ll1.add(100);
//		ll1.add(200);
//		ll1.add(600);
//		ll1.add(500);
//		System.out.println(ll1);
//		System.out.println("Get element from 1 index position "+ll1.get(1));
//		ll1.add(1, 1000);
//		System.out.println(ll1);
//		System.out.println("Get element from 1 index position "+ll1.get(1));
//		Integer i =200;
//		ll1.remove(i);  // remove using value 
//		ll1.remove(3);	// remove using index 
//		System.out.println(ll1);
		
		// LinkedList class 
		
//		List ll1 = new LinkedList();
//		ll1.add(100);
//		ll1.add(200);
//		
//		ll1.add(600);
//		ll1.add(500);
//		System.out.println(ll1);
//		System.out.println("Get element from 1 index position "+ll1.get(1));
//		ll1.add(1, 1000);
//		System.out.println(ll1);
//		System.out.println("Get element from 1 index position "+ll1.get(1));
//		Integer i =200;
//		ll1.remove(i);  // remove using value 
//		ll1.remove(3);	// remove using index 
//		System.out.println(ll1);
		
		// Vector class 
		
		//List ll1 = new Vector();
//		Vector ll1 = new Vector();
//		ll1.add(10);
//		ll1.addElement(20);
//		System.out.println(ll1);
		
		// Stack 
				Stack ss = new Stack();
				ss.push(10);
				ss.push(20);
				ss.push(30);
				ss.push(40);
				System.out.println(ss);
				System.out.println("remove top most elemenet "+ss.pop());
				System.out.println(ss);
				System.out.println("display top most elemenet "+ss.peek());
				System.out.println(ss);
				System.out.println("size "+ss.size());
				System.out.println("search "+ss.search(10));
				System.out.println("search "+ss.search(100));
		
	}

}