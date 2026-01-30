package lectures_java;

public class Printdigitsofnumbers {
	public static void main(String[] args) {
		int num = 123;
		int counter = 0;
		while(num>0) {
			int remainder = num%10;
			System.out.println(remainder);
			counter++;
			num = num/10;
		}
		System.out.println(counter);
	}
}
