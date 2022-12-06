import java.lang.reflect.Array;

public class array_is_sorted {
	
	public static boolean issorted(int arr[], int si) {
		
		if(si == arr.length-1) {
			return true;
		}
		if(arr[si] > arr[si+1]) {
			return false;
		}
		boolean issmallsorted = issorted(arr, si+1);
		return issmallsorted;
	}
		
}