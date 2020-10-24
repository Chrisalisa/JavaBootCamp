package sef.module6.sample;

public class VirtualMethodSample {
	public static void main(String arg[]){
		Person_P p = new Person_P();
		Person_P p1 = new Student_P();
		p1.setName("John Doe");
		
		//Student inherits the methods and behavior from the Person class
		Student_P s = new Student_P();
		s.setName("Jane Doe");
	
		s.setSchool("A Fictional School");
		s.setGrade(10);
		
		rollCall(s);
		rollCall(p);
		rollCall(p1);

	}
	
	public static void rollCall(Person_P temp){
			temp.announce();
	}
}
