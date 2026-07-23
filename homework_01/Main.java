package homework.homework_01;

public class Main {

	public static void main(String[] args) {
		Notification[] notifications = {
			new EmailNotification("sato@example.com", "注文が完了しました"), 
			new EmailNotification("yamada@example.com", "注文が完了しました"), 
			new SmsNotification("090-0000-0000", "認証コードは1234です"), 
			new PushNotification("user-001", "新しいお知らせがあります"), 
		};
	
		for (Notification notification : notifications) {
			notification.send();
			notification.send();
			notification.send();
		}
	}
}
