package finalActivity;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name_a, int age_a) {
		this.name=name_a;
		this.age=age_a;
	}
	public void setName(String name_a) {
		this.name=name_a;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age_a) {
		this.age=age_a;
	}
	public int getAge() {
		return age;
	}
	
	public void personalIntro() {
		System.out.println("My name is "+name+" and i am "+age+" years old!");
	}

}
