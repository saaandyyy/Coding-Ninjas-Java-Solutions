/*Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :
1) Only one disk can be moved at a time.
2) A disk can be moved only if it is on the top of a rod.
3) No disk can be placed on the top of a smaller disk.
Print the steps required to move n disks from source rod to destination rod.
Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.
Input Format :
Integer n
Output Format :
Steps in different lines (in one line print source and destination rod name separated by space)
Constraints :
0 <= n <= 20
Sample Input 1 :
2
Sample Output 1 :
a b
a c
b c
Sample Input 2 :
3
Sample Output 2 :
a c
a b
c b
a c
b a
b c
a c
*/



public class TowerOfHanoi {
	
	public static void towerOfHanoi(int numberOfDisk, char source, char helper, char destination) {
		
		if(numberOfDisk == 0) {
			return;
		}
		
		if(numberOfDisk == 1) {
			System.out.println(source + " " + destination);
			return;
		}
		
		towerOfHanoi(numberOfDisk-1, source, destination, helper);
		
		System.out.println(source + " " + destination);
		
		towerOfHanoi(numberOfDisk-1, helper, source, destination);
		
	}

}
