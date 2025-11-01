package src.interfaces.assignments;

public class BasicPhone implements IFeaturePhone {

	@Override
	public void call() {
		System.out.println("Call Basic Phone");
	}

	//Should be averrriden
	@Override
	public String sendMessage(String message) {
		System.out.println("Send Message Basic Phone");
		return "Send Message Basic Phone" + message;
	}
	
	
	static void brandInfo() {
		System.out.println("Basic Phone brand Info");
	}
	
	//Own method
	public void showKeypadInfo() {
		System.out.println("Key pad of the phone");
		
	}
	
     //Default methods are allowed only in interface	
//	public default void playGames() {
//		System.out.println("Default method in Super Interface IFeaturePhone");
//	}

	

}
