package lectures_java;

public class NestedLoops {
	public static void main(String[] args) {
//		for(int row = 1;row <=5;row++) {
//			System.out.print("row" +row+"_");
//			for(int col = 1;col<=5;col++) {
//				System.out.print(col);
//			}
//		}
		
//		for(int i = 1;i<=4;i++) {
//			for(int j = 1;j<=8;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 1;i<=1;i++) {
			for(int j = 1;j<=5;j++) {
				for(int k = 1;k<=j;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
