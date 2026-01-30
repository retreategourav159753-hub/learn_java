package lectures_java;

public class Reversenumber {
	public static void main(String[] args) {
		int num = 123;
		int rev = 0;
		while(num>0) {
			int remainder = num%10;
			rev = rev*10 + remainder;
			num /=10;
		}
		System.out.println(rev);
	}
}
