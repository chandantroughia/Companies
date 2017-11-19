package Amazon;
import java.util.*;

public class GroupAnagrams {
	
	public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs){
		
		if(strs.length == 0 || strs == null) return new ArrayList<ArrayList<String>>();
		
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		//Arrays.sort(strs);
		
//		for(String s: strs){
//			System.out.print(s + " ");
//		}
//		System.out.println();
		
		for(String s : strs){
			
			char[] characters = s.toCharArray();
			Arrays.sort(characters);
			String key = String.valueOf(characters);
//			System.out.println(key);
			
			if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
			map.get(key).add(s);
			
		}
		
		return new ArrayList<ArrayList<String>>(map.values());
		
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(arr));
		
	}

}
