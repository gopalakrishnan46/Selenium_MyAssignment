package homeassignment.day2;

public class Palindrome {
	
	public static void main(String[] args) {
        int input = 12121; // Change this number to test other numbers
        int originalNumber = input;
        int output = 0;
        int i;
        int lastDigit;
                
        for (i = input; i != 0; i /= 10) // Reverse the number using a for loop
        {
            lastDigit = i % 10;
            output = output * 10 + lastDigit;
        }
        
        if (originalNumber == output) // Check if the original number is equal to the reversed number
        {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

	}

}
