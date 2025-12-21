package lectures_java;

import java.util.Scanner;

public class CalcGrades {
	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		System.out.print("Enter your percentage to check your grade : ");
		int percentage = scanIn.nextInt();
		if(percentage >= 90) {
			System.out.println("Your grade is A");
		}else if(percentage < 90 & percentage >=80) {
			System.out.println("Your grade is B");
		}if (percentage < 80 & percentage >=70){
			System.out.println("Your grade is C");
		}else if(percentage < 70 & percentage >30){
			System.out.println("Your grade is D Note: Pay attention on your studies !!");
		}else {
			System.out.println("failed !! better luck next time");
		}
	}
}
