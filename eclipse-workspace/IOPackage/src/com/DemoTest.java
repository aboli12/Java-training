package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoTest {

	public static void main(String[] args) throws Exception{
	// copy from one file to another file 
	FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\abc.txt");
	FileOutputStream fos = new FileOutputStream("info.txt");
	int ch;
	while((ch=fis.read()) != -1) {
			fos.write(ch);
	}
		fis.close();
		fos.close();
		System.out.println("file copied");
		
	// if we want to store primitive data in file 
//		int id=100;
//		String name = "Ravi";
//		float salary = 12000;
//		
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		dos.close();
//		fos.close();
//		System.out.println("employee data stored as primitive value");
		
		// read employee primitive information 
//		FileInputStream fis =new FileInputStream("emp.txt");
//		DataInputStream dis = new DataInputStream(fis);
//		int id1= dis.readInt();
//		String name1 = dis.readUTF();
//		float salary1 = dis.readFloat();
//		System.out.println("id is "+id1);
//		System.out.println("name is "+name1);
//		System.out.println("salary is "+salary1);
		
//		Employee emp = new Employee(100, "Ravi", 12000);
//		System.out.println(emp);
//		FileOutputStream fos = new FileOutputStream("employee.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp);
//		oos.close();
//		System.out.println("object serialization done!");
		
//		FileInputStream fis = new FileInputStream("employee.ser");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		Object obj = ois.readObject();
//		Employee emp1 = (Employee)obj;
//		System.out.println(emp1);
	}

}