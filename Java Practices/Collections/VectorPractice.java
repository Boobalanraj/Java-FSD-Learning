package com.collection.demo;
import java.util.*;
import java.util.Iterator;

public class VectorPractice {

	public static void main(String[] args) {
		
		Vector<String> names= new Vector<String>();
		
		System.out.println("Before Adding an Elements: "+names.size());
		
		names.add("Ram");
		names.add("Kumar");
		names.add("Kirba");
		names.add("Bala");
		names.add("Kumar");//Vector also allow duplicate value are allowed in list
		names.add(null);// Vector also contains null value
		
		System.out.println("After Adding an Elements: "+names.size());
		System.out.println(names);
		
		System.out.println("Element at index 4: "+names.get(4));
		names.add("Raj");
		
		System.out.println(names);
		
		System.out.println("Names Contains kumar? :"+names.contains("Kumar"));
		
		System.out.println("Names COntains Raj? : "+names.contains("Raj"));				
		
		names.remove(0);
		names.remove(null);
		names.remove("Kirba");
		
		System.out.println(names);
		
		
		//print a list using for loop
		
		for(String s:names) {
			System.out.println("Using For Loop: "+s);
		}
		
		
		Iterator<String> itr= names.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Using Iterator: "+itr.next());
		}
		System.out.println("Vector size: "+names.size());
		System.out.println(names);
	}
}
