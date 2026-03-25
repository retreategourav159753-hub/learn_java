package lectures_java;
import java.util.Scanner;

public class RecursionFactorial {
	static long factorial(long num) {
		int i = 1;
		if(num>1) {
			return num* factorial(num-i);
		}else {
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num for factorial finding = ");
		long fact = scan.nextLong();
		System.out.println(factorial(fact));
	}
}
