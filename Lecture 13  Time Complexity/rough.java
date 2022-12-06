import java.util.HashMap;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.Spring;
	
	
public class rough {
		
		static Scanner sc = new Scanner(System.in);
		
		public static int[] takeInput() throws IOException {
			
			int size = sc.nextInt();
			int[] input = new int[size];
			
			if(size == 0) {
				return input;
			}
			
			for(int i=0; i<size; i++) {
				input[i] = sc.nextInt();
			}
			return input;
		}
		
		public static void printArray(int[] arr) {
			int size = arr.length;
			for(int i=0; i<size; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		

		public static void main(String[] args) throws NumberFormatException, IOException {
			int [] arr1 = takeInput();
			//int [] arr2 = takeInput();
			int d = sc.nextInt();
			
			;
			int result[]= RotateArray.rotate(arr1, d);
			printArray(result);
		}
}
