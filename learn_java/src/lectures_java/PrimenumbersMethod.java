package lectures_java;

public class PrimenumbersMethod {
	static void primeNum(int num) {
		if(num%2 != 0 || num%5!=0) {
			System.out.println("the num is prime!");
		}else {
			System.out.println("the num is not prime");
		}
	}
	public static void main(String[] args) {
		primeNum(45);
	}
}
