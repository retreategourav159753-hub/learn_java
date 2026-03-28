package lectures_java;

public class SwapArrays {

	public static void main(String[] args) {
		int[] myArray = {4,2,6,4,5,2,8,9};
		
		int temp = myArray[0];
		myArray[0] = myArray[7];
		myArray[7] = temp;
		for(int i = 0;i<myArray.length;i++) {
			System.out.print(myArray[i] + " , ");
		}
	}
}
