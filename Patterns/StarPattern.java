/*Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
*/



import java.util.*;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=1;
		while(i<=N) {
			int spaces=1;
			while(spaces<=N-i) {
				System.out.print(' ');
				spaces++;
			}
			int star=1;
			while(star<=i) {
				System.out.print("*");
				star++;
			}
			int dec=i-1;
			while(dec>=1) {
				System.out.print("*");
				dec--;
			}
			System.out.println();
			i++;
		}
		

	}

}
