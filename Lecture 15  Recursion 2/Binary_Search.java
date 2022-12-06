
public class Binary_Search {
	
	public static int binarySearch(int[] arr, int si, int ei, int x) {
		
		int len = arr.length;
		if(si > ei) {
			return -1;
		}
		int middleIndex = (si + ei)/2;
		if(arr[middleIndex] == x) {
			return middleIndex;
		}
		else if(arr[middleIndex] < x) {
			return binarySearch(arr, middleIndex+1, ei, x);
		}
		else {
			return binarySearch(arr, si, middleIndex-1, x);
		}
	}

}
