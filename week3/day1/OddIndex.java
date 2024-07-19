package homeassignment.week3.day1;

public class OddIndex {
	
	public static void main(String[] args) {
		
		String test ="changeme";
		//String output = "";
		
		char[] charArray = test.toCharArray();
		
		for(int i = charArray.length-1;i>=0; i--)
			
		{
			if (i%2!=0) {
				charArray[i]= Character.toUpperCase(charArray[i]);
			}
			else 
			{
				charArray[i]= Character.toLowerCase(charArray[i]);
			}
		}
		System.out.println(charArray);
		
		
	}

}
