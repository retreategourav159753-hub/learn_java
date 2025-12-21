package lectures_java;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int money = scan.nextInt();
		//if(money>=5000){
			//System.out.println("bhai tum mehangi party de sakte ho!");
		//}else if (money<5000 & money>=500) {
			//System.out.println("bhai tum sasti party de sakte ho!");
		//}else {
			//System.out.println("tum to saalo bhikari ho party mat do to hi accha hai!");
		//}
		
		//Switch Statements
		System.out.print("enter a number between 0-3 : ");
		int num = scan.nextInt();
		switch(num) {
		case 1: System.out.println("you choosen 1");
		break;
		case 2: System.out.println("you choosen 2");
		break;
		default:System.out.println("wrong option choosen !!");
		}
	}

}
