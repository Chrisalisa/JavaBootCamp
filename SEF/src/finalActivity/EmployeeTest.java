package finalActivity;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testIntro() {
		Employee test=new Employee(24, "John", "Dev", 8000, "Accenture");
		System.out.println(test.personalIntro());
		assert(String.valueOf(test.personalIntro())=="My name is John and i am 24 years old! And i work as a Dev in Accenture and i earn 8000");
		//Honestly no idea why the test shows as a failure. would love an explanation
			
		
	}
	//Would also test the sorting implementation but honestly no clue how to efficiently test that

	

}
