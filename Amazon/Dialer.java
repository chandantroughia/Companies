package Amazon;

import java.util.ArrayList;
import java.util.*;

public class Dialer {
	
	public static List<String> letterCombinations(String digits) {
        
		String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> ans = new LinkedList<String>();
        
        if(digits.length() == 0 || digits == null) return ans;
        ans.add("");
        for(int i = 0 ; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            System.out.println(x);
            while(ans.peek().length() == i){
                String t = ans.remove();
                for(char ch : map[x].toCharArray()){
                    ans.add(t + ch);
                }
            }
        }
        return ans;
        
    }

	public static void main(String[] args) {
		String str = "23";
		System.out.println(letterCombinations(str));
	}

}
