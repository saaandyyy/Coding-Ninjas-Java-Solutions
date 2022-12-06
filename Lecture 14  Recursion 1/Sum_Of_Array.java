/*Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    
*/



public class Sum_Of_Array {
	
	public static int sumofarray(int arr[]) {
		int len = arr.length;
		if(len == 1) {
			return arr[0];
		}
		int smallarray[] = new int[len-1];
		for(int i=0; i<len-1; i++) {
			smallarray[i] = arr[i];
		}
		
		return sumofarray(smallarray) + arr[len-1];
	}
}
