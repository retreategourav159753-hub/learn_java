package lectures_java;

import java.util.Scanner;

public class Primenum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean checker = false;
		
		if(num==2) {
			System.err.println("It is a Prime Number");
		}
		
		if(num>2) {
			for(int i = 2;i<=Math.sqrt(num);i++) {
				if(num%2 != 0) {
					checker = true;
				}else {
					System.err.println("num is not prime");
					break;
				}
			}
			if(checker) {
				System.err.println("prime");
			}
		}
	}
}
