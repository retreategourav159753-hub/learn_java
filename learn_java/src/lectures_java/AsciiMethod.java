package lectures_java;

public class AsciiMethod {
	static int returnAscii(char myChar) {
		return (int)myChar;
	}
	public static void main(String[] args) {
		char myChar = 'A';
		System.out.println(returnAscii(myChar));
	}
}
