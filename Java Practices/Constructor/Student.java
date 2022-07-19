package com.phase2;

public class Student {

		int rollno;
		String fullname;
		String department;
		float fees;
		
		//default constructor
		public Student() {
			rollno=1;
			fullname="Boobalan N";
			department="CSE";
			fees=35000;
		}
		
		//parametrized constructor
		public Student(int rollno,String fullname,String department,float fees) {
			this.rollno=rollno;
			this.fullname=fullname;
			this.department=department;
			this.fees=fees;
		}
		
		public void display() {
			System.out.println("Roll No: "+rollno);
			System.out.println("Name: "+fullname);
			System.out.println("Department: "+department);
			System.out.println("Balance fees: "+fees);
			System.out.println();
			
		}
		
		public static void main(String[] args) {
			
			Student e= new Student();
			Student e1= new Student(20, "Boobalan N", "CSE", 450000); 

			//calling default constructor
			e.display();
			//parametrized constructor
			e1.display();
			
			 
		
		}

		
	}

