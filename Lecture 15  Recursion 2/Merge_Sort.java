/*Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/



public class Merge_Sort {
	
	public static void merge(int[] arr2, int[] arr3, int[] arr) {

		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr2.length && j < arr3.length) {
			if(arr2[i] <= arr3[j]) {
				arr[k] = arr2[i];
				i++;
				k++;
			}
			else {
				arr[k] = arr3[j];
				j++;
				k++;
			}
		}
		
		while(i < arr2.length) {
			arr[k] = arr2[i];
			i++;
			k++;
		}
		
		while(j < arr3.length) {
			arr[k] = arr3[j];
			j++;
			k++;
		}
		
	}
	
	public static void mergeSort(int[] arr) {
		
		int len = arr.length;
		if(len <= 1) {
			return;
		}
		int a = arr.length/2;
		int b = arr.length-a;
		int[] arr2 = new int[a];
		int[] arr3 = new int[b];
		for(int i=0; i<a; i++) {
			arr2[i] = arr[i];
		}
		for(int i=a; i<len; i++) {
			arr3[i-a] = arr[i];
		}
		
		mergeSort(arr2);
		mergeSort(arr3);
		
		merge(arr2, arr3, arr);
	}

}
