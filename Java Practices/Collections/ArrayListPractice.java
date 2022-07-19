package com.collection.demo;
import java.util.*;
import java.util.ArrayList;

public class ArrayListPractice {

			
			public static void main(String[] args) {
				
				ArrayList<String> names= new ArrayList<String>();
				
				System.out.println("Before Adding an Elements: "+names.size());
				
				names.add("Ram");
				names.add("Kumar");
				names.add("Kirba");
				names.add("Bala");
				names.add("Kumar");// duplicate value are allowed in list
				names.add(null);// list contains null value
				
				System.out.println("After Adding an Elements: "+names.size());
				System.out.println(names);
				
				System.out.println("Element at index 4: "+names.get(4));
				names.add("Hari");
				
				System.out.println(names);
				
				System.out.println("Names Contains kumar? :"+names.contains("Kumar"));
				
				System.out.println("Names COntains Raju? : "+names.contains("Raju"));				
				
				names.remove(0);
				names.remove(null);
				names.remove("Bala");
				
				System.out.println(names);
				
				
				//print a list using for loop
				
				for(String s:names) {
					System.out.println("Using For Loop: "+s);
				}
				
				
				//iterate using iterator
				Iterator<String> itr= names.iterator();
				
				while(itr.hasNext()) {
					System.out.println("Using Iterator: "+itr.next());
				}
				System.out.println(names);
			
			}

	}
