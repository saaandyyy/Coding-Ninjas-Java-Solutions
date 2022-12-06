import java.util.Scanner;

public class Calculate_SumOfNaturalNumber {
	
	private static int sumn(int n) {
		if(n == 0) {
			return 0;
		}
		
		int small = sumn(n-1);
		int result = n + small;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumn(n));
	}

}
