
public class ReverseString {
	
	public static String reverseString(String str) {
		int n = str.length();
		String reverse = "";
		
		for(int i=n-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
}
