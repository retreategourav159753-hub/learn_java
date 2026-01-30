package lectures_java;

public class Recursion {
	static void printNum(int num) {
		if(num>0) {
			printNum(num - 1);
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		printNum(6);
	}
}
