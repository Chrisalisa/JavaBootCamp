package finalActivity;

public class MyException extends Exception{
	public String toString() {
		return "This is my exception activity exception";
	}
	public String getMessage(){
	return "Names and last names are not allowed to contain numbers!";	
	}
}
