package com.model;

import org.springframework.data.redis.core.RedisHash;
		
@RedisHash("employee")				// Employee type is Redis Hash data type. 
public class Employee {
private int id;
private String name;
private float salary;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}