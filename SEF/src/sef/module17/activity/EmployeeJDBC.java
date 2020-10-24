package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {

	public Connection createConnection()
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost/employees";
		String user = "root";
		String pass = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public Employee findEmployeeById(String id)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
		// 1 - Create a PreparedStatement with a query
			PreparedStatement stmt=con.prepareStatement("SELECT emp_no, first_name,last_name FROM employees WHERE emp_no= (?)");
		// 2 - Search for the given id
			stmt.setString(1, id);		
		// 3 - Execute this query
			ResultSet result=stmt.executeQuery();
		
		// 4 - If resultset is not null, then initialize emp object with data 
		if(result.next()) {
			System.out.println("YEET");
			emp= new Employee();
			emp.setId(result.getString(1));
			emp.setFirstName(result.getString(2));
			emp.setLastName(result.getString(3));
		}
		else System.out.println("No employee with such an ID found");
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	public ArrayList<Employee> findEmployeesByName(String name)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
			PreparedStatement stmt=con.prepareStatement("SELECT emp_no, first_name,last_name FROM employees WHERE first_name= (?)");
			stmt.setString(1, name);		
			ResultSet result=stmt.executeQuery();
			if(result.next()) {
				do {
					Employee temp=new Employee();
					temp.setId(result.getString(1));
					temp.setFirstName(result.getString(2));
					temp.setLastName(result.getString(3));
					list.add(temp);
					//System out println was left for testing purposes
					System.out.println(temp.getFirstName()+" "+temp.getLastName()+ " "+temp.getId());
					temp=null;
				}while(result.next());
				
			}else list=null;
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	//Salary section was removed due to provided database not containing salary information
	//And in terms of function it is a precise repeat of findEmployeesByName
	//Database was adjusted to auto increment the ID and to accept null values for values not found in the employee object
	public void insertEmployee(Employee emp)
	{
		try {
		Connection con = createConnection();
		
		//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
		
		con.setAutoCommit(false);
		PreparedStatement stmt=con.prepareStatement("INSERT INTO employees (emp_no, birth_date, first_name, "
				+ "last_name, gender, hire_date) "
				+ "VALUES (NULL, NULL, ?, ?, NULL, NULL) ");
		stmt.setString(1, emp.getFirstName());
		stmt.setString(2, emp.getLastName());
		stmt.executeUpdate();
		//	Substitute the ? now.
		
		//2 - Execute this query using executeUpdate()
			
		//Row output was removed due to method only receiving one employee to update the database with
		con.commit();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
