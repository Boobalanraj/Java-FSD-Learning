package com.collection.demo;
import java.util.*;

public class PriorityQueuePractice {
		
		public static void main(String[] args) {
		
			PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(); 

			pQueue.add(56);
			pQueue.add(72);
			pQueue.add(50);
			pQueue.add(89);
			pQueue.add(13);
			pQueue.add(72);//duplicate value allowed in priority queue
		 //pQueue.add(null);null value is not allowed in priority queue,if the null value declare it shows error
			
			//print priority queue
			
			System.out.println(pQueue);
			
			
			//print the top element of priority queue
			System.out.println("Top Element: " + pQueue.peek());
			
			pQueue.add(40);
			System.out.println(pQueue);
			
			System.out.println("Printing the top element and removing: "+pQueue.poll());
			System.out.println(pQueue);
			
			//print the top element of priority queue
			System.out.println("Top Element: " + pQueue.peek());
			
			
			//remove element from pqueue
			
			pQueue.remove(89);
		
			
			System.out.println("After Remove : "+pQueue);
			
		}

	}

