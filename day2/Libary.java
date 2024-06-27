package homeassignment.day2;

public class Libary {
       
	public String addBook(String bookTile) // Creating method 1 with string parameter.  
	   {
		System.out.println("Book added successfully");
		return bookTile; // return stored string value. 
		}
     public void issueBook() 
     {
    	 System.out.println("Book issued successfully");
		
	 }
    public static void main(String[] args) {
		Libary lib = new Libary(); // Creating object for class 'Libary'.
		
		System.out.println(lib.addBook("Java concepts")); // calling method 1 using object "lib" and print the statement return in method 1
		lib.issueBook(); // calling method 2 using object "lib" and print the statement return in method 2
	}

}

