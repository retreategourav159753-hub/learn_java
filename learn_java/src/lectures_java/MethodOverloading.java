package lectures_java;

public class MethodOverloading {
	static int highest(int num1 , int num2) {
		int greatest;
		if(num1>=num2) {
			greatest = num1;
		}
		else {
			greatest = num2;
		}
		return greatest;
	}
	
	static int highest(int num1,int num2,int num3) {
		int greatest;
		if(num1>=num2 && num1>=num3) {
			greatest = num1;
		}
		else if(num2>=num1 && num2>=num3) {
			greatest = num2;
		}
		else {
			greatest = num3;
		}
		return greatest;
	}
	
	public static void main(String[] args) {
		System.out.println(highest(2,3));
		System.out.println(highest(1,22,3));
		
	}
}
