package homework.homework_01;

public class EmailNotification extends Notification {
	
	public EmailNotification(String recipient, String message) {
		super(recipient, message);
	}
	
	public void send() {
		System.out.println("メール送信：" + this.getRecipient() + " に「" + this.getMessage() + "」");
	}
	
}
