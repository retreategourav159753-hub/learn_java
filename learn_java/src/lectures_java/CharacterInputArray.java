package lectures_java;

import java.util.Scanner;

public class CharacterInputArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter size of the array :- ");
		int size = scan.nextInt();
		char[] arr = new char[size];
		System.out.println("please enter characters according to the entered size of the array :- ");
		for(int i = 0;i<size;i++) {
			arr[i] = scan.next().charAt(0);
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ,");
		}
	}
}
