/*Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:
*/



public class Remove_X {
	
	public static String removeX(String str, char x) {
		
		if(str.length() == 0) {
			return str;
		}
		
		String ans = removeX(str.substring(1), x);
		if(str.charAt(0) == x) {
			return ans;
		}
		else {
			return str.charAt(0) + ans;
		}
		
	}

}
