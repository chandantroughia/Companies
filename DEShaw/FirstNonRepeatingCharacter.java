package DEShaw;

public class FirstNonRepeatingCharacter {

	
	private static char find(String str){
		
		int[] frequency = new int[26];
		
		for(int i = 0; i < str.length(); i++){
			frequency[str.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < str.length(); i++){
			if(frequency[str.charAt(i) - 'a'] == 1){
				return str.charAt(i);
			}
		}
		
		return '0';

	}
	
	public static void main(String[] args) {
		String str1 = "zxvczbtxyzvy";
		String str2 = "hello";
		System.out.println(find(str1));
		System.out.println(find(str2));
	}
}
