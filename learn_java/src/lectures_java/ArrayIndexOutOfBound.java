package lectures_java;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		try {
			System.out.println(arr[4]);
		}catch(Exception e) {
			System.out.println("Exception handle kar raha hoon !");
		}
	}
}
