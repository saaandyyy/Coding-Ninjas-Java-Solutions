/*Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/



import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=0;
		long ans=0;
		int rem=0;
		int num=N;
		
		while(num>0) {
			rem=num%10;
			int pv=(int)Math.pow(2, i);
			ans=ans+rem*pv;
			num=num/10;
			i++;
		}
		System.out.println(ans);

	}

}
