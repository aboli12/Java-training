package com;
interface Info {
	public String sayHello(String name);
}
class InfoImpl {
	public static String sayHello(String name) {
		return "Welcome user with static method reference"+name;
	}
}
class InfoImpl1 {
	public String sayHello(String name) {
		return "Welcome user with non static method reference "+name;
	}
}
public class MethodReferenceExample {
	public static void main(String[] args) {
		Info f1 = InfoImpl::sayHello;				// static method reference 
		System.out.println(f1.sayHello("Ravi"));
			Info f2 = (name)->"Welcome user "+name;
			System.out.println(f2.sayHello("Ravi"));  	// providing logic using lambda style 
		InfoImpl1 obj = new InfoImpl1();
		Info f3 = obj::sayHello;
		System.out.println(f3.sayHello("Ravi"));
	}

}
