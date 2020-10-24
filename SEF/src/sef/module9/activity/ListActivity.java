package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List<String> listA=new ArrayList();
		listA.add("Jānis");
		listA.add("Jons");
		listA.add("Johans");
		//2 - Call print method to print the list passed as its parameter.
		ListActivity printeris=new ListActivity();
		printeris.print(listA);
	}
	
	void print(List<String> list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		for(String lister: list) {
			System.out.println(lister);
		}
	}
}
