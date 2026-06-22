package homework.homework_04;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserService();
		
		String[] users = {"田中さん", "", "佐藤さん"};
		
		for(String user : users) {
			try {
				userService.registration(user);
			}catch(InvalidUserException e) {
				System.out.println("登録失敗：" + e.getMessage());
			}
		}
		
	}
}
