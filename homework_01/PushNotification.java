package homework.homework_01;

public class PushNotification extends Notification {
	
	public PushNotification(String recipient, String message) {
		super(recipient, message);
	}
	
	public void send() {
		System.out.println("プッシュ通知：" + getRecipient() + " に「" + getMessage() + "」");
	}
	
}
