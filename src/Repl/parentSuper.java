package Repl;

public class parentSuper {

//	In Parent class. 
//	Create a constructor, it will take a String parameter called city. 
//	include the logic of printing the parameter value. 
//	Create another constructor without parameter. 
//	Include the logic of printing "Parent Constructor". 
//
//	Create a Child Class that should be a subclass of Parent class
//	Inside child class create a constructor that will make a call to parameterized constructor of the parent class.
//
//	In Main class. 
//	Create an Object of the child class by passing String value "Vienna"
//
//	Expected Output:
//
//	Vienna
	String city;

	parentSuper(String city) {
		this.city = city;
	}

	parentSuper() {
		System.out.println("Parent Constructor");

	}
}
//class child extends pesonInheritance {
//	child(String city) {
//		super(city);
//		}
//		void display() {
//			System.out.println(city);
//		}
//}


