package com.accessmodifier.demo;

import java.util.Scanner;

public class ArithmeticCalculator {
	
	public void addition(double input1,double input2) {
		double result=input1+input2;
		System.out.println("Addition of two numbers:"+result);
	}
	
	public void subtraction(double input1,double input2) {
		double result=input1-input2;
		System.out.println("Subtraction of two numbers:"+result);
	}
	
	public void multiplication(double input1,double input2) {
		double result=input1*input2;
		System.out.println("Multiplication of two numbers:"+result);
	}
	
	public void division(double input1,double input2) {
		double result=input1/input2;
		System.out.println("Division of two numbers:"+result);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("first number: ");
		double input1= in.nextDouble();
		System.out.print("Secon number: ");
		double input2=in.nextDouble();
		
		ArithmeticCalculator obj = new ArithmeticCalculator(); 

		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int choose= in.nextInt(); 
		switch(choose){
			case 1: obj.addition(input1, input2);
			break;
			
			case 2: obj.subtraction(input1, input2);
			break;
			
			case 3: obj.multiplication(input1, input2);
			break;
			
			case 4: obj.division(input1, input2);
			break;
			
			default: System.out.println("Enter invalid choose");
			break;
		}
		in.close();
	}

}
