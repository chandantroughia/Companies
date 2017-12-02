package Adobe;

public class GoodOrBadString {

	private static boolean isGood(String str){
		int vCount = 0;
		int cCount = 0;
		
		String vowels = "aeiou";
		                 
		for(int i = 0; i < str.length(); i++){
			if(vowels.indexOf(str.charAt(i)) == -1){
				cCount++;
				vCount = 0;
				if(cCount > 3){
					return false;
				}
			}
			else{
				vCount++;
				cCount = 0;
				if(vCount > 5){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String a = "aeioud";
		String b = "bcdfgaei";
		String c = "chandan";
		
		System.out.println(isGood(a));
		System.out.println(isGood(b));
		System.out.println(isGood(c));
	} 
	
	
}
