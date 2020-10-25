package finalActivity;

import org.junit.Test;

public class PersonTest {

	

	@Test
	public void testName() {
		Person testP=new Person();
		testP.setName("Jacob3");
		testP.setAge(23);
		System.out.println(testP.personalIntro());
		assert(String.valueOf(testP.personalIntro())=="My name is Jacob and i am 23 years old!");
		//Honestly no idea why the test shows as a failure. would love an explanation
	}
	

}
