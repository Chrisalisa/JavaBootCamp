package finalActivity;

import java.util.ArrayList;
import java.util.Collections;

public class FirstActivity {
 public static void main(String args[]) {
	 Employee e1=new Employee(21, "Gatis", "Dev",7000, "Accenture");
	 Employee e2=new Employee(21, "Janis", "Tester",800, "Accenture");
	 Employee e3=new Employee(25, "Jana", "Secretary",1200, "Accenture");
	 Employee e4=new Employee(39, "Dave", "CEO",8000, "Accenture");
	ArrayList<Employee> list=new ArrayList<Employee>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	Collections.sort(list);
	for(Employee lister: list) {
		System.out.println(lister.personalIntro());
	}
 }
}

