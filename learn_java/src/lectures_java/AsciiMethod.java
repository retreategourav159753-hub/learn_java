package lectures_java;
import java.util.Scanner;

public class AsciiMethod {
	static int returnAscii(char myChar) {
		return (int)myChar;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a character = ");
		char myChar = scan.next().charAt(0);
		System.out.println(returnAscii(myChar));
	}
}
