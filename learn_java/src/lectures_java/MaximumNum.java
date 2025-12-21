package lectures_java;

import java.util.Scanner;

public class MaximumNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your first num : ");
		int num1 = scan.nextInt();
		System.out.print("enter your second num : ");
		int num2 = scan.nextInt();
		System.out.print("enter your third num : ");
		int num3 = scan.nextInt();
		
		//firstly we will type the normal if statement :-
		
		//if(num1 > num2 && num1 > num3) {
			//System.out.println("This is the first biggest num : " + num1);
		//}else if(num2 > num1 && num2 > num3) {
			//System.out.println("This is the first biggest num : " + num2);
		//}if(num3 > num1 && num3 > num2) {
			//System.out.println("This is the first biggest num : " + num3);
		//}
		
		//Then we have to type this program with the help of ternary operator
		
		int result = ( num1 > num2 ) ? ( num1 > num3 ? num1 : num3) : ( num2 > num3 ? num2 : num3);
		System.out.println("biggest number is : " + result);
	}
}
