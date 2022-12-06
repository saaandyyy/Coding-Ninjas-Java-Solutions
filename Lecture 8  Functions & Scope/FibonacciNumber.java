/*Given a number N, figure out if it is a member of fibonacci series or not.
 Return true if the number is member of fibonacci series else false.

Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/



import java.util.*;
public class FibonacciNumber {
	
	public static boolean checkMember(int N) {
		if(N==0) {
			return true;
		}
		else {
			int val1=(5*N*N)-4;
			int sq1=(int)Math.sqrt(val1);
			
			if(sq1==val1) {
				return true;
			}
			else {
				int val2=(5*N*N)+4;
				int sq2=(int)Math.sqrt(val2);
				return (sq2*sq2==val2);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		System.out.println(checkMember(N));

	}

}
