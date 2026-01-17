package lectures_java;
import java.util.Scanner;
public class Factorialnum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact = 1;
		//increasing order factorial
//		for(int i = 1;i<=num;i++) {
//			fact *=i;
//		}
//		System.out.println(fact);
		
		for(int i = num;i>=1;i--) {
			fact *=i;
		}
		System.out.println(fact);
	}
}
