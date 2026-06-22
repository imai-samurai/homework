package homework.homework_04;

public class UserValidator {
	
	public static void nameCheck(String name) throws InvalidUserException {
		
		if("".equals(name)) {
			throw new InvalidUserException("名前が入力されていません");
		}
		
	}
}
