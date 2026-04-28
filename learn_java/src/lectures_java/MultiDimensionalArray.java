package lectures_java;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] myArray = {{1,2,3,4},{5,6,7,8}};
		int[] myArray1 = {1,2,3,4,5};
		for(int row =0;row<myArray.length;row++) {

			for(int col = 0;col<myArray[row].length;col++) {
				System.out.print(myArray[row][col] + ",");
			}
			
			System.out.println();
		}
	}
}
