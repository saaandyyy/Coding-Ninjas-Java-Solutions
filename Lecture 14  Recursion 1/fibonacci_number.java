
public class fibonacci_number {
	
	public static int fibo(int n) {
		
		if(n == 1 || n == 2) {
			return 1;
		}
		int fibo1 = fibo(n-1);
		int fibo2 = fibo(n-2);
		int result = fibo1 + fibo2;
		return result;
	}
}
