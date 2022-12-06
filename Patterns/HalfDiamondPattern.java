/*Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
*/



import java.util.*;
public class HalfDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("*");
		
		for(int i=1;i<=N;i++) {
			System.out.print("*");
			
			int num=1;
			for(int j=0;j<i;j++) {
				System.out.print(num);
				num++;
			}
			num--;
			
			for(int j=1;j<i;j++) {
				--num;
				System.out.print(num);
			}
			System.out.println("*");
		}
		
		for(int i=0;i<N;i++) {
			System.out.print("*");
			
			int num=1;
			
			for(int j=0;j<(N-i-1);j++) {
				System.out.print(num);
				num++;
			}
			num=num-2;
			
			for(int j=num;j>=1;j--) {
				System.out.print(j);
			}
			
			if(i<N-1) {
				System.out.println("*");
			}
			else {
				System.out.println(" ");
			}
		}
		if(N==0) {
			System.out.println("*");
		}
		

	}

}
