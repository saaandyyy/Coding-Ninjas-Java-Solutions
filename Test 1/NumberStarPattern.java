/*Print the following pattern for given number of rows.
Input format :

Line 1 : N (Total number of rows)

Sample Input :
   5
Sample Output :
1234554321
1234**4321
123****321
12******21
1********1

*/



import java.util.*;
public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int n1=N, n2=N-1, n3=N;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=n1;j++) {
				System.out.print(j);
			}
			for(int j=n2;j<N-1;j++) {
				System.out.print("**");
			}
			for(int j=n3;j>=1;j--) {
				System.out.print(j);
			}
			n1--;
			n2--;
			n3--;
			System.out.println();
		}

	}

}
