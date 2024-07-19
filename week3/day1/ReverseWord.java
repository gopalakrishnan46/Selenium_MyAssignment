package homeassignment.week3.day1;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		String test = "I am a software tester";	
		String[] word = test.split(" ");
		System.out.print("Before reverse: " + test+ "\n");
		System.out.print("After reverse: ");
		
		for (int i=0; i<word.length;i++) {
			
			if(i%2 !=0) {
				StringBuilder revWord = new StringBuilder(word[i]).reverse();
				
				word[i]=revWord.toString();
				
				}
			
			System.out.print(word[i] + " ");
		}
		System.out.println();
		
		
		
		}

	}


