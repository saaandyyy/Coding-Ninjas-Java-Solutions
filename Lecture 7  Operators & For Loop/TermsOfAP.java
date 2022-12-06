/*Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
*/



import java.util.*;
public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int count=0;
		if(X==0) {
			return;
		}
		
		for(int i=1;i<=(3*X)+2;i++) {
			int N=(3*i)+2;
			if(N%4!=0) {
				System.out.print(N+" ");
				count++;
			}
			if(count==X) {
				break;
			}
		}

	}

}
