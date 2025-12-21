package lectures_java;

import java.util.Scanner;
public class CalculatorProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your first num : ");
		int num1 = scan.nextInt();
		System.out.print("enter your first num : ");
		int num2 = scan.nextInt();
		System.out.print("Choose an operator to perform operations [ + , - , * , / or % ] : ");
		char operator = scan.next().charAt(0);
		
		switch(operator) {
		case '+' : System.out.println("your addition = " + (num1 + num2));
		           break;
		case '-' : System.out.println("your subtraction = " + (num1 - num2));
		           break;
		case '*' : System.out.println("your multiplication = " + (num1 * num2));
		           break;
		case '/' : System.out.println("your division = " + (num1 / num2));
		           break;
		case '%' : System.out.println("your modulasisation = " + (num1 % num2));
		           break;
		default : System.err.println("this is incorrect type of operator !!!");           
		}
	}
}
