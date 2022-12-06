
public class ReplacePi {
	
	public static String replaceCharWithPi(String str) {
		
		int len = str.length();
		if(len <= 1 ) {
			return str;
		}
		
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			String result = replaceCharWithPi(str.substring(1));
			return "3.14" + result;
		}
		else {
			String result = replaceCharWithPi(str.substring(1));
			return str.charAt(0) + result;
		}
		
	}

}
