package homework.homework_02;

public class NumberConverter {
	
	public void conversion(String inputWord) {
		
		try {
			int word = Integer.parseInt(inputWord);
			System.out.println(word + " は数値に変換できました");
			
		}catch(NumberFormatException e) {
			System.out.println(inputWord + " は数値に変換できません");
		}
		
	}
}
