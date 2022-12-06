/*Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
Input format :
Line 1 : Integer N
Line 2 : Choice C
Output Format :
 Sum or product according to user's choice
Constraints :
1 <= N <= 12
Sample Input 1 :
10
1
Sample Output 1 :
55
Sample Input 2 :
10
2
Sample Output 2 :
3628800
Sample Input 3 :
10
4
Sample Output 3 :
-1
*/



import java.util.*;
public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int choice=sc.nextInt();
		
		if(choice==1) {
			int sum=(N*(N+1))/2;
			System.out.println(sum);
		}
		else if(choice==2) {
			int i=1;
			int product=1;
			while(i<=N) {
				product=product*i;
				i++;
			}
			System.out.println(product);
		}
		else {
			System.out.println("-1");
		}

	}

}
