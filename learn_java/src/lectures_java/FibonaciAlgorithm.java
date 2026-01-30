package lectures_java;

public class FibonaciAlgorithm {
	public static void main(String[] args) {
	    int num1 = 0;
		int num2 = 1;
		int fib;
		for(int i = 0;i<=10;i++) {
			fib = num1+num2;
			System.out.println(fib);
			num1 = num2;
			num2 = fib;
		}
	}
}
