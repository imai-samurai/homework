package homework.homework_01;

abstract public class Notification {
	
	private String recipient;
	private String message;
	
	public Notification(String recipient, String message) {
		this.recipient =  recipient;//通知先
		this.message =  message;//通知内容
	}
	
	public String getRecipient() {
		return this.recipient;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public abstract void send();
	
}