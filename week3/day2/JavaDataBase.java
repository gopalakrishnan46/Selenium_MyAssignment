package homeassignment.week3.day2;

public class JavaDataBase extends JavaConnection {

	public static void main(String[] args) {
		
		JavaDataBase JB = new JavaDataBase();
		JB.connect();
		JB.disconnect();
		JB.executeUpdate();
	}
}
