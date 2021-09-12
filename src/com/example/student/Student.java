package com.example.student;
import java.util.Comparator;

public class Student implements Comparable<Student> {

	int no;
	String name;
	int age;
	Student(){};
	
	
	public Student(int no, String name, int age) {
		// TODO Auto-generated constructor stub
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	


	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return name.compareTo(s1.name);
	}
	
	@Override
	public String toString() {
		return no +" - " + name + "(" + age + ")";
	}
	
}
