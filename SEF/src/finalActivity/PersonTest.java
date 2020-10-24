package finalActivity;

import org.junit.Test;

public class PersonTest {

	

	@Test
	public void testName() {
		Person testP=new Person();
		testP.setName("Jacob");
		assert(testP.getName()=="Jacob");
	}
	@Test
	public void testAge() {
		Person testP=new Person();
		testP.setAge(21);
		assert(testP.getAge()==21);
	}
	@Test
	public void testParameterConstructor() {
		Person testP=new Person("Layla", 43);
		assert((testP.getAge()==43)&&(testP.getName()=="Layla"));
		
	}

}
