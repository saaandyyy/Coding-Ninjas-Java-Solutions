/*Print the following pattern for the given number of rows.
Pattern for N = 4
   1
  232
 34543
4567654

The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
        1
       232
      34543
     4567654
    567898765
Sample Input 2:
4
Sample Output 2:
        1
       232
      34543
     4567654
*/



import java.util.*;
public class TriangleOfNumbers {

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
			int num=1;
			while(num<=i) {
				System.out.print(i+num-1);
				num++;
			}
			int dec=i-1;
			while(dec>=1) {
				System.out.print(i+dec-1);
				dec--;
			}
			System.out.println();
			i++;
		}
		

	}

}
