package com.collection.demo;

import java.util.*;

public class LinkedHashsetPractice {

		public static void main(String[] args) {
			
			LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
			
			linkedset.add("A");
			linkedset.add("B");
			linkedset.add("C");
			linkedset.add("D");
			linkedset.add("B");//do not allows duplicate values
			linkedset.add("D");
			linkedset.add(null);
			
			System.out.println("Size: "+linkedset.size());
			
			System.out.println(linkedset);
			
			System.out.println("Contains C: "+linkedset.contains("C"));
			
			System.out.println("Contains E: "+linkedset.contains("E"));
			
			linkedset.remove(null);
			
			System.out.println("After Remove: "+linkedset);
			
			// you can iterate using for loop
			
			// you can iterate using iterator
		}

	}
