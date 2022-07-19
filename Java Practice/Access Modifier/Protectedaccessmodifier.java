package com.testmodifier.demo;

import com.accessmodifier.demo.Accessmodifier;

public class Protectedaccessmodifier{

	public static void main(String[] args) {
		
		Accessmodifier obj = new Accessmodifier();
		
		obj.publicAccess();
		//obj.protectedAccess();protected method we can't access out side of package without using extends parent class
		//obj.privateAccess()private method we can't access out side of class
		//obj.defaultAccess();default method we can't access out side of package
	}
}
