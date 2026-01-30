package lectures_java;

public class Armstrongnumber {
	public static void main(String[] args) {
		int num = 563;int sum = 0;
		while(num>0) {
			int remainder = num%10;
			sum = sum + (remainder*remainder*remainder);
			num /=10;
		}
		System.out.println(sum);
	}
}
