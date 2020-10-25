package finalActivity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SecondActivityTest {

	

	@Test
	public void testAddition() {
		SecondActivity test=new SecondActivity();
		double[] test1= {2, -3, 0, 14};
		assert(test.addition(test1)==13);
	}
	@Test
	public void testMultiplication() {
		SecondActivity test=new SecondActivity();
		double[] test1= {2, -3, 1, 14};
		assert(test.multiplication(test1)==-84);
	}
	@Test
	public void testSubtraction() {
		SecondActivity test=new SecondActivity();
		double x=13;
		double y=-4;
		assert(test.subtraction(x,y)==17);
	}
	@Test
	public void testDivision() {
		SecondActivity test=new SecondActivity();
		double x=13;
		double y=-4;
		assert(test.division(x, y)==-3.25);
	}

}
