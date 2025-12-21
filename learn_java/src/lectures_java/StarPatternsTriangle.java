package lectures_java;

public class StarPatternsTriangle {
	public static void main(String[] args) {
//		for( int rows = 1;rows<=5;rows++) {
//			//spaces
//			for(int spaces = 5-rows;spaces<=rows;spaces--) {
//				System.out.print(" ");
//			}
//			
//			//stars
//			for(int stars = 1;stars<=rows;stars++) {
//				System.out.println("* ");
//			}
//		}
		
		int rows = 5;

		for (int i = 1; i <= rows; i++) {

		    // spaces
		    for (int s = rows - i; s > 0; s--) {
		        System.out.print(" ");
		    }

		    // stars
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }

		    System.out.println();
		}

	}
}
