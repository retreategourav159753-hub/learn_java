package lectures_java;

public class FibonnaciRecursion {
	
	static int sum = 0;
	static int num1 = 0;
	static int num2 = 1;
	
    static void fibRecursion(int inp) {
		if(inp > 0) {
			sum= num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.println(sum);
			fibRecursion(inp-1);
		}
	}
	
	public static void main(String[] args) {
		fibRecursion(15);
	}
}
