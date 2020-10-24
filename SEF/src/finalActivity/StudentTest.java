package finalActivity;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testSchoolName() {
		Student test1=new Student();
		test1.setSchoolName("IZV");
		assert(test1.getSchoolName()=="IZV");
	}

}
