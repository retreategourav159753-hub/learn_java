package lectures_java;

public class Recursion {
	static void printSeries(int num) {
		if(num>0) {
			printSeries(num-1);
		}
		System.out.println(num);
	}
	public static void main(String[] args) {
		printSeries(5);
	}
}