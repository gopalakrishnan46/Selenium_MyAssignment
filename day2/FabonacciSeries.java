package homeassignment.day2;

public class FabonacciSeries {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int i;
		int count=8;
		int num3;
		System.out.println(num1+" \n"+num2);  // At first, printing 0 and 1 
		
		for(i=2;i<count;++i) // At second, loop start from 2 because 0 and 1 already printed
		{
			
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
	}

}
