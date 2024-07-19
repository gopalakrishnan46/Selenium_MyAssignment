package homeassignment.week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	
	public static int SecondNumber(Integer[] num,int total) {
        
		List<Integer> list = Arrays.asList(num);
		
		Collections.sort(list);
	
		int element =list.get(total-2);
		return element;
		
	}

	public static void main(String[] args) {
		Integer num[] ={3, 2, 11, 4, 6, 7};
				
		System.out.println(SecondNumber(num,6));
		
		
		
	}
}
