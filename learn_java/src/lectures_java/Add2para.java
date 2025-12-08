package lectures_java;

import java.util.Scanner;

public class Add2para {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please write a paragraph atleast in about 50 words : ");
        String para1 = in.nextLine();
        System.out.print("Please write a paragraph again atleast in about 50 words : ");
        String para2 = in.nextLine();
        System.out.println(para1 + "and" + para2);
    }
}
