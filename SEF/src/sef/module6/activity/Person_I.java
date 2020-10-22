package sef.module6.activity;

/* Person_I class is the superclass 
 * Attributes : name, age
 */
public class Person_I {

	//Attributes
	private String name;
	private int age;
	
	//Behavior - write default constructor. Print 'I'm Person_I constructor'
	public Person_I(){
		this.name="unknown";
		this.age=0;
		System.out.println("I'm person_I constructor");
	}
	
	//Behavior - write parameterized constructor
	public Person_I(int x, String y) {
		this.name=y;
		this.age=x;
	}
	
	// write getter for String name
	public String getName() {
		return name;
	}
	
	// write setter for String name
	public void setName(String x) {
		this.name=x;
	}

	// write getter for int age
	public int getAge() {
		return age;
	}
	

	// write setter for int age
	public void setAge(int x) {
		this.age=x;
	}
}

