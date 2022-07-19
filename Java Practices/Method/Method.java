package com.phase2;

public class Method {

	public void print() {
		System.out.println("Method without parameter");
	}
	
	public void display(String name) {
		System.out.println("My name is "+ name);
	}
	
	public int cube(int n) {
		
		return n*n*n;
	}
	
	public String myname(String full,String lname) {
		
		return full+" "+lname;
	}
	
	public static void main(String []args) {
		
		Method clear = new Method();
		
		clear.print();
		clear.display("Boobalan");
		
		int result =clear.cube(5);
		System.out.println("Result of cube value is "+result);
		
		String fullname=clear.myname("Boobalan","N");
		System.out.println("Full name is "+fullname);
}

}