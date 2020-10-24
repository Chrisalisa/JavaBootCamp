package finalActivity;

public class Student extends Person{
	private String schoolName;
	
	Student(){}
	Student(int age, String name, String schoolName){	
		this.schoolName=schoolName;
		this.setName(name);
		this.setAge(age);
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public void personalIntro() {
		super.personalIntro();
		System.out.println("And i study in "+schoolName);
	}

}
