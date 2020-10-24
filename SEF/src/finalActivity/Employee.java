package finalActivity;

public class Employee extends Person implements Comparable<Employee>{
	
	private String jobTitle;
	private String company;
	private int salary;
	Employee(){}
	Employee(int age, String name, String jobTitle_a, int salary, String company_a){	
		this.jobTitle=jobTitle_a;
		this.company=company_a;
		this.salary=salary;
		this.setName(name);
		this.setAge(age);
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle_a) {
		this.jobTitle = jobTitle_a;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company_a) {
		this.company = company_a;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void personalIntro() {
		super.personalIntro();
		System.out.println("And i work as a "+jobTitle+" in "+company+" and i earn "+salary);
	}
	public int compareTo(Employee employee) {
		return this.salary-employee.salary;
	}
	
}
