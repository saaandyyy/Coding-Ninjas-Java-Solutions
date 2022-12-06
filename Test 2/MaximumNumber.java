/*We are given a 4 digit number using digits 1 to 9.
 What is the maximum 3 digit number that we can make by removing one digit from the given integer.

Input Format :
A 4 digit number
Output Format :
A 3 digit number
Sample Input :
5438
Sample Output :
548
Explanation :
1. If we remove 5, the new number is 438.
2. If we remove 4, the new number is 538.
3. If we remove 3, the new number is 548.
4. If we remove 8, the new number is 543.
Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548
*/


import java.util.*;
public class MaximumNumber {
	
	private static int max_number(int n) {
		// TODO Auto-generated method stub
		for(int j = 0;j<1;j++) {
			int ans = 0;
			int i = 1;
			
			while(n/i>0) {
				int temp = (n/(i*10))*i+(n%i);
				i*=10;
				ans = Math.max(ans, temp);
			}
			n=ans;
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(max_number(N));

	}

}
