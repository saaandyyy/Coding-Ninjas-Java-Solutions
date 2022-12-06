import java.util.Scanner;

public class Calculate_Factorial {
	
	private static int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		int smalloutput = fact(n-1);
		int result = n * smalloutput;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	
}
