package homeassignment.week3.day2;

public  abstract class JavaConnection implements DataBaseConnection {
	
	public void connect() {
		
		System.out.println("Database connect sucessfully");
		}
 
	public void disconnect() {
		
		System.out.println("Database Disconnected");
		
	}
	
	public void executeUpdate() {
		 
		System.out.println("Query has been updated & 1 row affected");
	}

}
