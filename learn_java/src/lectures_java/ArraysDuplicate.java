package lectures_java;
import java.util.Arrays;
public class ArraysDuplicate {

	public static void main(String[] args) {
		int arr[] = {1,6,2,4,6,2,4,6,2,3};
		Arrays.sort(arr);// arr = 1,2,2,2,3,4,4,6,6,6;
		
		for(int i= 0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
			
			while(i<arr.length-1 && arr[i]==arr[i+1]) {
				i++;
			}
		}
	}
}
