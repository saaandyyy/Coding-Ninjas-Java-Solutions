
public class replace_with_x {
	
	public static String replace(String str, char a, char x) {
		
		if(str.length() == 0) {
			return str;
		}
		
		String ans = replace(str.substring(1), a, x);
		
		if(str.charAt(0) == a) {
			return x + ans;
		}
		else {
			return str.charAt(0) + ans;
		}
	}

}
