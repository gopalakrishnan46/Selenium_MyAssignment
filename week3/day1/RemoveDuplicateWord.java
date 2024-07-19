package homeassignment.week3.day1;

public class RemoveDuplicateWord {
	
	public static void main(String[] args) {
		
		String input ="We learn Java basics as part of java sessions in java week1";
		String[] split=input.split(" ");
		for(int i=0;i<split.length;i++) {
			int count = 0;
			for(int j=0; j<split.length;j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					count = count + 1;
					if(count > 1) {
						split[j] = "";
					}
				}
			}
		}
		input = String.join(" ", split);
		System.out.println(input);
	} 

}
