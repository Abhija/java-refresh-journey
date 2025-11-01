package src.interfaces.assignments;

/**
 * Interface extendign another inteface, It will inherit all the methods of the parent interfac
 * the class that implements this should implement all of this
 * @author Abhija
 *
 */
public interface ISmartPhone extends IFeaturePhone {

	String[] showApps();

	void browse();

	void useCamera();

	default void downloadMusic() {
		System.out.println("SmartPhone: Downloading music from the app store.");
	}

	
	
}
