package homeassignment.week3.day1;

public class APIClient {
	
	public void sendRequest(String endpoint, boolean receive ) {
		
		System.out.println(" Send Request "+ endpoint + true);
		
	}
	
	public void sendRequest(String endpoint, String requestBack, boolean status) {
		
		System.out.println(" Send request "+ endpoint+" request back "+ requestBack+" status "+ true);
	}
	
	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("Request initiated", true);
		api.sendRequest("Received", "responded", true);
	}

}
