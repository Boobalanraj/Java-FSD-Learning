package com.accessmodifier.demo;

public class Accessmodifier {
	
	public void publicAccess() {
		System.out.println("This is Public access ");
	}
	
	private void privateAccess() {
		System.out.println("This is Private access");
	}
	
	public void protectedAccess() {
		System.out.println("This is protected access");
	}
	
	void defaultAccess() {
		System.out.println("This is default access");
	}

	public static void main(String[] args) {
		

		Accessmodifier obj= new  Accessmodifier();
		
		obj.publicAccess();
		obj.privateAccess();
		obj.protectedAccess();
		obj.defaultAccess();
	}
}
