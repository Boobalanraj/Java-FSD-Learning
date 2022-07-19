package com.collection.demo;

import java.util.*;

public class TreesetPractice {

		public static void main(String[] args) {

			Set<String> set = new TreeSet<String>();  
			
			set.add("Banana");
			set.add("Cherry");
			set.add("Almond");
			set.add("Apple");
			//set.add(null);null value is not allowed u=in Treeset
			
			System.out.println(set);
			
			System.out.println("Size: "+set.size());
			
			System.out.println("Contains: "+ set.contains("Banana"));
			
			set.remove("Apple");
			System.out.println("After remove Apple: "+set);
			// iterate using for loop 
			
			// iterate using iterator
		 
			
		}

	}
