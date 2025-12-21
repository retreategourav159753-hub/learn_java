package lectures_java;

import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a number to check if it is even or odd : ");
		int inNum = scan.nextInt();
		if(inNum%2 == 0) {
			System.out.println("You entered an even number !!");
		}else {
			System.out.println("You entered an odd number !!");
		}
	}
}
