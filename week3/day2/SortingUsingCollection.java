package homeassignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		
		//Delcare a String array
		List<String> names = new ArrayList<String>();
		//add collections to list
		names.add("HCL");
		names.add("Wipro");
		names.add("Asprire system");
		names.add("CTS");
		
		//Sort the list in the ascending order
		Collections.sort(names);
		//Iterate through the list in reverse order and print the elements
		for(int i=names.size()-1;i>=0;i--)
		{
		System.out.println(names.get(i));	
		}
		
		//System.out.println(names);
		
	}

}
