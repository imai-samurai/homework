package homework.homework_03;

public class Main {

	public static void main(String[] args) {
		
		AgeChecker ac = new AgeChecker();
		
		int[] ages = {20, 15, 30};
		
		for(int age : ages) {
			try {
				ac.check(age);
			} catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
