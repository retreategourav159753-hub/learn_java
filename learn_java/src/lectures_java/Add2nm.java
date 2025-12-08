package lectures_java;

import java.util.Scanner;

public class Add2nm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your first integer = ");
        int num1 = scan.nextInt();
        System.out.print("Enter your second integer = ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("This is the sum of your integers = " +sum);
    }
}
