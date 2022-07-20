package com.map.demo;

import java.util.*;
public class HashTablePractice {
	
	public static void main(String[] args) {
		
	

    Hashtable<String,String> hTable=new Hashtable<String,String>();  
   hTable.put("A", "Kumar");
   hTable.put("B", "Jenni");
   hTable.put("D", "Dravid");
   hTable.put("Raj", "N");
   hTable.put("Naveen", "Kumar");
   //hTable.put(null, null);not allowed in HashTable
   
   System.out.println("After adding elements: "+hTable);
   
   hTable.remove("Naveen");
   System.out.println("After Removing elements: "+hTable);
   
   System.out.println("\nThe elements of HashTable are: ");  
    for(Map.Entry<String,String> n:hTable.entrySet()){    
     System.out.println(n.getKey()+" "+n.getValue());    
    }

}

}