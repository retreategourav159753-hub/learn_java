package lectures_java;

import java.util.Scanner;

public class InputArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter the size of array :- ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("please enter the elements of array :- ");
		
		for(int i = 0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print("elements :- " + arr[i] + " ,");
		}
	}
}
