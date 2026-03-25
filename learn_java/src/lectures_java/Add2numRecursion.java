package lectures_java;

public class Add2numRecursion {
	
	public static void main(String[] args) {
		int num = 100;
		for(int i = 0;i<num;i++) {
			num--;
			i += num;
			System.out.println(i);
		}
	}
}
