package lectures_java;

import java.util.Scanner;
public class TernaryOperators {
	public static void main(String[] args) {
		//int res = (2<3) ? 2*3 : 4-5;
		//System.out.println(res);
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a num : ");
		int num = scan.nextInt();
		boolean result = (num%2==0) ?true : false;
		System.out.println(result);
	}
}
