package lectures_java;

public class PallindromeNum {
	static void pallindrome(int num) {
		int rev = 0; int temp=num;
		while(num>0) {
			int rem = num%2;
			rev= rev*10+rem;
			num/=10;
		}
		if(rev==temp) {
			System.out.println("pallindrome");
		}else {
			System.err.println("not pallindrome!!!!");
		}
	}
	public static void main(String[] args) {
		pallindrome(20001);
	}
}
