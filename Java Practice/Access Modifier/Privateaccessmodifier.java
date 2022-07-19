package com.accessmodifier.demo;

public class Privateaccessmodifier {

	public static void main(String [] args) {
		
		Accessmodifier obj= new  Accessmodifier();
				
				obj.publicAccess();
				//obj.methodPrivate(); private method we can't access out side of class
				obj.protectedAccess();
				obj.defaultAccess();
}
}
