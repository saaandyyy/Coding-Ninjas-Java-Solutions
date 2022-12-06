/*Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/



public class Remove_Duplicates_Recursively {
	
	public static String removeDuplicatesConsecutive(String str) {
		
		int len = str.length();
		if(len <= 1) {
			return str;
		}
		
		if(str.charAt(0) == str.charAt(1)) {
			return removeDuplicatesConsecutive(str.substring(1));
		}
		else {
			String result = removeDuplicatesConsecutive(str.substring(1));
			return str.charAt(0) + result;
		}
		
	}

}
