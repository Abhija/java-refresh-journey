package src.interfaces.assignments;

public interface IFeaturePhone {

	void call();

	String sendMessage(String message);

	static void brandInfo() {
		System.out.println("Feature Phone brand Info");
	}

	default void playGames() {
		System.out.println("Default method in Super Interface IFeaturePhone");
	}

}
