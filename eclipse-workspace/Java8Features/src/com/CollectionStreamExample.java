package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamExample {

	public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Ravi");names.add("Raju");names.add("Lokesh");names.add("Ram");names.add("Veeta");
	names.add("Raj");names.add("Vijay");names.add("Rajesh");names.add("Mahesh");names.add("Seeta");
	
//	names.forEach(name->System.out.println(name));
//	names.stream().forEach(name->System.out.print(name+" "));
//	names.stream().filter(name->name.contains("ee")).forEach(name->System.out.print(name+" "));
//	names.stream().map(name->"Hi "+name.toUpperCase()).forEach(name->System.out.print(name+" "));
//	long numberOfStd = names.stream().count();
//	System.out.println("number of records are "+numberOfStd);
//	boolean resul1 = names.stream().anyMatch(name->name.startsWith("A"));
//	System.out.println(resul1);
	
	boolean resul1 = names.stream().allMatch(name->name.contains("a"));
	System.out.println(resul1);
	
	// after apply one or more than one intermediate operator we want to store this result and pass to another 
	// team. 
//	List<String> filterName= names.stream().filter(name->name.contains("ee")).collect(Collectors.toList());
//	System.out.println("filter names are "+filterName);
	}

}