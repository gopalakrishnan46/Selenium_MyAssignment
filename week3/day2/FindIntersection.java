package homeassignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {
	
	
	public static void main(String[] args) {
		
		Integer num1[] = {3, 2, 11, 4, 6, 7};
		Integer num2[] = {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(num1));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(num2));
		
		List<Integer> intersection = new ArrayList<>();
		
		for(Integer num : list1) {
			
				if (list2.contains(num)) {
					
					intersection.add(num);
					
				}
			}
		System.out.println(intersection);	
		
		
	}

}
