package lectures_java;

public class SpanArrays {

	public static void main(String[] args) {
		int array[] = {10,20,50,3,5,62,92,356};
		
		int max = array[0];
		int min = array[0];
		
		for(int value : array) {
			if(max<value) {
				max = value;
			}
			if(min>value) {
				min = value;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		int span = max - min;
		
		System.out.println(span);
	}
}
