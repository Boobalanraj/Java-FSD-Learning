package com.collection.demo;
import java.util.*;

public class LinkedListPractice {
		
		public static void main(String[] args) {
			
			LinkedList<Integer> list= new LinkedList<Integer>();
			
			System.out.println("Before adding an elements: "+list.size());
			
			list.add(80);
			list.add(67);
			list.add(75);
			list.add(13);
			list.add(67);
			list.add(13);//Linked list also allow Duplicate values
			list.add(null);//Linked list also allow null values
			
			System.out.println("After adding an elaments: "+list.size());
			System.out.println(list);
			
			list.remove(5);
			
			System.out.println("After removing element in list: "+list);
			
			System.out.println("Element 2: "+list.get(5));
			list.add(4,0);
			
			System.out.println("After adding element in list:"+list);
			
			System.out.println("First Element: "+list.getFirst());
			
			System.out.println("Last Element: "+list.getLast());
			
		}

	}
