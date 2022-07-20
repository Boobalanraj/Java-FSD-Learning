package com.map.demo;

import java.util.*;

public class TreeMapPractice {

	public static void main(String[] args) {
	      TreeMap<String,Integer> tMap=new TreeMap<String,Integer>();    
	      
	      tMap.put("Kumar",8);
	      tMap.put("Kumar", 2);//If the same key value given means it over write existing key value  
	      tMap.put("Raj", 5);
	      tMap.put("Ravi", 6);
	      tMap.put("fathima", 5);
	      tMap.put("Sachin", 10);
	      System.out.println("After adding elements: "+tMap);
	      
	      tMap.remove("Kumar");
	      System.out.println("After revome elemts: "+tMap);
	      
	      System.out.println("Contrains Raj: "+tMap.containsKey("Raj"));
	      
	      System.out.println("The elements of TreeMap are ");  
	      for(Map.Entry<String,Integer> list:tMap.entrySet()){    
	       System.out.println(list.getKey()+" "+list.getValue());    
	      }    

	}
}
