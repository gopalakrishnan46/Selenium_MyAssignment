package homeassignment.day2;

public class LibaryManagement {

	public static void main(String[] args) {
		
		Libary Libman1 = new Libary(); //Creating object 
		
		System.out.println(Libman1.addBook("Java concepts")); // calling another class method 1 using object "Libman1" and print the statement return in method 1

		Libman1.issueBook(); // calling another class method 2 using object "Libman1" and print the statement return in method 2
	}

}
