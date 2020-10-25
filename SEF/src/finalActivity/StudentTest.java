package finalActivity;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testIntro() {
		Student test=new Student(24, "John3", "Bootcamp");
		
		System.out.println(test.personalIntro());
		assert(String.valueOf(test.personalIntro())=="My name is John and i am 24 years old! And i study in Bootcamp");
		//Honestly no idea why the test shows as a failure. would love an explanation
	}

}
