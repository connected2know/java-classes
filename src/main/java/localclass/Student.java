package main.java.localclass;

public class Student {

	static final String valueToUse = "abc";

	public void methodWithLocalClass(){

		class Grade{ // local class (class defined inside a method)
	
			public void methodA(){
				System.out.println(valueToUse);
			}
	
		}

	}
}
