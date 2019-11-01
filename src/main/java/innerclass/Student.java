package main.java.innerclass;


public class Student {
	
	class Grade{} // Inner class (class inside top-level class without static modifier in the definition)
	
	public static void main(String[] args) {
		
		Student enclosingClass = new Student();

		Student.Grade innerObject = enclosingClass.new Grade(); //way of instantiate a inner class
	}
}
