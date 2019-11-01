package main.java.anonymousclass;

public class Student {

	static final String valueToUse = "abc";

	interface Anonymous{}

	Anonymous AnonymousObject = new Anonymous(){ //  1 - Anonymous class definition

		public void anonymousMethod() {
			System.out.println("Hi");
		}
		
	}; // 2 - closing anonymous class
}
