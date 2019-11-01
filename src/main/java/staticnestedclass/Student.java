package main.java.staticnestedclass;

public class Student {
	
	static class Grade{} // static modifier being used in the definition of a static nested class

	
	public static void main(String[] args) {
		
		Student.Grade nestedObject = new Student.Grade(); //way of instantiate a nested static class
	}
}
