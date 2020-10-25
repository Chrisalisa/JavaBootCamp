package finalActivity;

public class Person {
	private String name;
	private String lastName;
	private int age;
	
	public Person() {}
	public Person(String name_a, String lastName, int age_a)throws MyException {
		try {
			validateInput(name_a);	
			this.name=name_a;
			}
			catch(MyException e) {
				System.out.println(e.getMessage());
			}
		try {
			validateInput(lastName);	
			this.lastName=lastName;
			}
			catch(MyException e) {
				System.out.println(e.getMessage());
			}
	}
	public void setName(String name_a)  {
		try {
		validateInput(name_a);	
		this.name=name_a;
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		try {
			validateInput(lastName);	
			this.lastName=lastName;
			}
			catch(MyException e) {
				System.out.println(e.getMessage());
			}
	}
	public void setAge(int age_a) {
		this.age=age_a;
	}
	public int getAge() {
		return age;
	}
	
	public String personalIntro() {
		return "My name is "+name+" and i am "+age+" years old!";
	}
	public void validateInput(String input) throws MyException {
		int flag=0;
		char[] inputChar=input.toCharArray();
		for(char x: inputChar) {
			if(Character.isDigit(x))flag=1;
		}
		if(flag==1) throw new MyException();
	}

}
