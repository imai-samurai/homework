package homework.homework_03;

public class AgeChecker {
	
	public void check(int age) throws IllegalArgumentException{
		
		if(age >= 18) {
			System.out.println(age + "歳：利用可能です");
		} else {
			throw new IllegalArgumentException(age + "歳：18歳未満は利用できません");
		}
		
	}
}
