package lectures_java;
import java.util.Scanner;
public class Views {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an character = ");

        //int intInput = in.nextInt();

        //System.out.println("This is your input " +intInput);
        char ch = in.next().charAt(0);
        System.out.println(ch);

    }
}
