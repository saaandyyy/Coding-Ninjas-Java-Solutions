/*Reverse the given string word wise. That is, the last word in given string should come at 1st place, 
 * last second word at 2nd place and so on. Individual words should remain as it is.

Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/



public class ReverseStringWordwise {
	public static String reverseWordWise(String input) {
		String x = "";
		int space = input.length();
		
		for(int i=space-1;i>=0;i--) {
			if(i == 0) {
				x = x + input.substring(0, space);
			}
			else if(input.charAt(i) == ' ') {
				x = x + input.substring(i+1, space)+" ";
				space = i;
			}
		}
		return x;
		
	}
}
