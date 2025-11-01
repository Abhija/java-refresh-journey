package src.interfaces.assignments;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// static method in super interface
		IFeaturePhone.brandInfo();

		//Direct implement of the interface
		IFeaturePhone basicPhone = new BasicPhone();
		basicPhone.call();		
		
		//DefaultMethod
		basicPhone.playGames();
		
		//Own method cannot be called with parent reference
		//basicPhone.showKeypadInfo();
		System.out.println("Next level child##############");

	    //Calling the overridden static method 
		BasicPhone.brandInfo();
		
		//Parent reference child class
		ISmartPhone smart = new AndroidPhone();
		smart.call();
		
		System.out.println("Status: " + smart.sendMessage("What's the address?"));
		
		smart.playGames();
		
		System.out.println("Available Apps: " + Arrays.toString(smart.showApps()));
        smart.browse();
        smart.useCamera();
        
        // Calls default method from ISmartPhone
        smart.downloadMusic();
		
		

	}

}
