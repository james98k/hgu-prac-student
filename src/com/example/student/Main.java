package com.example.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		
//		list.add(new Student(2, "kim", 20));
//		list.add(new Student(1, "Lim", 21));
//		list.add(new Student(2, "park", 22));
//		list.add(new Student(0, "kkkim", 23));
//		list.add(new Student(1, "Limmm", 24));
//		list.add(new Student(2, "lee", 25));
//		list.add(new Student(0, "jim", 26));
//		list.add(new Student(1, "peng", 27));
//		list.add(new Student(2, "chao", 28));
//		list.add(new Student(2, "hui", 20));
		
		Student s1 = new Student(2, "dan", 20);
		Student s2 = new Student(1, "cha", 21);
		Student s3 = new Student(2, "ahn", 22);
		Student s4 = new Student(2, "bum", 22);
		Student s5 = new Student(2, "jil", 22);
		Student s6 = new Student(2, "lim", 22);
		Student s7 = new Student(2, "kim", 22);
		Student s8 = new Student(2, "james", 22);
		Student s9 = new Student(2, "hill", 22);
		Student s10 = new Student(2, "don", 22);
		
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		
		
		
		
		Collections.sort(list);
		
		System.out.println(list);
//		for(int i = 0; i< 10; i++) {
//			System.out.println(list.toString());
//		}
	}

}
