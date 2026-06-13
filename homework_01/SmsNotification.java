package homework.homework_01;

public class SmsNotification extends Notification {
	
	public SmsNotification(String recipient, String message) {
		super(recipient, message);
	}
	
	public void send() {
		System.out.println("SMS送信：" + getRecipient() + " に「" + getMessage() + "」");
	}
	
}
