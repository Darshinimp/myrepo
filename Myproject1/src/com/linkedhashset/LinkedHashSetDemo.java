package com.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		LinkedHashSet<Integer>lset=new LinkedHashSet<Integer>();
		lset.add(10);
		lset.add(30);
		lset.add(5);
		lset.add(15);
		System.out.println("Linked hash set :"+lset);
		//ArrayList<Integer> arr=new ArrayList<>(lset);
		//Collections.sort(arr);
		TreeSet<Integer> t=new TreeSet<>(lset);
		System.out.println("sorted"+t);
	}

}
