package com.testmodifier.demo;

import com.accessmodifier.demo.Accessmodifier;

public class Defaultaccessmodifier extends Accessmodifier{

	public static void main(String[] args) {
		
		Accessmodifier obj = new Accessmodifier();
		
		obj.publicAccess();
		//obj.privateAccess(); private method we can't access out side of class
		obj.protectedAccess();
		//obj.defaultAccess(); default method we can't access out side of package
	}
}
