public class HelloWorld {

	private String message;
	
	public HelloWorld(){
		System.out.println("Instance of HelloWorld class created");
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void printMessage(){
		System.out.println("Message is " + message);
	}

}