package com.phase2;

public class CallByValue {
int n =100;
	public void process(int n) {
		this.n = n*10/100;
	}
	
	public static void main(String []args) {
		CallByValue obj = new CallByValue();
		
		System.out.println("Value of n before function call: "+obj.n);
		
		obj.process(300);
		System.out.println("Value of n after function call: "+obj.n);
	}
}
