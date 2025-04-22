package com.linkedhashset;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("HTML");
		t.add("Java");
		t.add("HTML");
		//t.add(null);
		System.out.println("Courses are :"+t);
	}

}
