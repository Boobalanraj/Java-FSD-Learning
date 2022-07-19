package com.collection.demo;

import java.util.*;

public class HashsetPractice {
	
		
		public static void main(String[] args) {
			
			HashSet<Integer> set= new HashSet<Integer>();
			
			set.add(20);
			set.add(55);
			set.add(2);
			set.add(36);
			set.add(67);
			set.add(67);//Duplicate value not allowed in hashset
			set.add(null);//Hashset allow null value 
			
			
			System.out.println("Size: "+set.size());
			
			System.out.println(set);
			
			System.out.println("Contains: "+ set.contains(55));
		
			System.out.println("Contains: "+ set.contains(60));
			
			set.remove(null);
			System.out.println("After remove element from set: " +set);
			
		}

	}

