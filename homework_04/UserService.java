package homework.homework_04;

public class UserService {
	

	public void registration(String name) throws InvalidUserException {
		
		try {
			UserValidator.nameCheck(name);
			System.out.println(name + "　を登録しました");
			
		} catch(InvalidUserException e) {
			System.out.println("UserServiceで例外を検知しました：" + e.getMessage());
			throw e;
		}
		
	}
}
