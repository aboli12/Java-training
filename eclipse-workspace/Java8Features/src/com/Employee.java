package com;

public class Employee {
private int pid;
private String pname;
private float salary;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int pid, String pname, float salary) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [pid=" + pid + ", pname=" + pname + ", salary=" + salary + "]";
}

}
