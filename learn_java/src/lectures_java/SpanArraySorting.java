package lectures_java;

import java.util.Arrays;

public class SpanArraySorting {

	public static void main(String[] args) {
		int array[] = {2,6,6,5,6,2,4,8,52,6};
		Arrays.sort(array);
		int max = array[array.length-1];
		int min = array[0];
		System.out.println(max);
		System.out.println(min);
	}
}
