package lectures_java;

import java.util.Scanner;

public class OddNum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("entr num : ");
		int num = scan.nextInt();
		if(num%2 != 0) {
			System.out.println("It is an odd number !!");
		}else {
			System.out.println("It is an even number !!");
		}
	}

}
