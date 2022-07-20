package com.map.demo;

import java.util.*;
public class HashMapPractice {

	public static void main(String []args) {
		HashMap<Integer,String> hMap=new HashMap<Integer,String>(); 
		System.out.println("Before Adding elments: "+hMap);
		
	      hMap.put(1,"Devil");    
	      hMap.put(2,"Bala");    
	      hMap.put(3,"Kirba"); 
	      hMap.put(4, "Raj");
	       
	      System.out.println("After adding elements: "+hMap);  
	      
	      hMap.remove(4);
	      
	     //Print a list using for loop
	      System.out.println("After remove 4: "+hMap);
	      for(Map.Entry<Integer,String> m:hMap.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }

	}
	
    }


