package src.interfaces.assignments;

public class AndroidPhone implements ISmartPhone {

	@Override
	public void call() {
		System.out.println("Android phone call");
	}

	@Override
	public String sendMessage(String message) {
		String androidMessage = "Android phone message" + message;
		return androidMessage;
	}

	@Override
	public String[] showApps() {
        return new String[]{"Maps", "Social Media", "Browser", "Music"};
    }

	@Override
	public void browse() {
		System.out.println("Browse in Android");
		// TODO Auto-generated method stub

	}

	@Override
	public void useCamera() {
		System.out.println("Android phone camera");
		// TODO Auto-generated method stub

	}

}
