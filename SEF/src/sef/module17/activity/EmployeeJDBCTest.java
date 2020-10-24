package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}

	public void testFindEmployeeById_MatchFound() {
		Employee sentboi=new Employee();
		sentboi=emp.findEmployeeById("10001");
		assertNotNull(sentboi);
	}

	public void testFindEmployeeById_NoMatchFound() {
		//complete the code here
		Employee sentboi=new Employee();
		sentboi=emp.findEmployeeById("1000");
		assertNull(sentboi);
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		ArrayList<Employee> saraksts=new ArrayList<Employee>();
		saraksts=emp.findEmployeesByName("lols");
		assertNotNull(saraksts);
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		ArrayList<Employee> saraksts=new ArrayList<Employee>();
		saraksts=emp.findEmployeesByName("Dougasdasda");
		assertNull(saraksts);
	}


	
	public void testInsertEmployee(){
		//complete the code here
		Employee test=new Employee();
		test.setFirstName("lols");
		test.setLastName("trollis");
		emp.insertEmployee(test);
		assert(emp.findEmployeesByName("lols")!=null);
	}
}
