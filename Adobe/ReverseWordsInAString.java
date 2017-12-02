package Adobe;

import java.util.Arrays;

public class ReverseWordsInAString {
	
	
	private static String reverseWrods(String str){
		
		String[] temp = str.split("\\.");
		String ans = "";
		for(int i = temp.length - 1; i >=0 ; i--){
			ans += temp[i] + ".";
		}
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		System.out.println(reverseWrods(str));
	}

}
