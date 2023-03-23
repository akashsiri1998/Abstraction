package com.infosys;

 abstract class Demo
 {
	 abstract void m1();
	 abstract void disp();
	 
}

 
public class Abstract1 extends Demo {

	public static void main(String[] args) {
		Abstract1 a=new Abstract1();
		a.m1();
		a.disp();
	
	}
		public void m1() {
			System.out.println("Akash patil");
		}
		public void disp() {
			System.out.println("velocity");
		}
		
	}


