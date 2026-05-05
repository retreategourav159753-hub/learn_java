package lectures_java;
import java.util.ArrayList;
public class ArraysList {

	public static void main(String[] args) {
		//Single dimensional ArrayList:-
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.remove(0); //the removed in the bracket is referenced by the index(index); 
		System.out.println(list);
		
		list.add(1);
		System.out.println(list);
		
		list.set(0,1);
		list.set(1,2);
		list.set(2,3);
		System.out.println(list);
		
		System.out.println(list.size());
		
		//Multi-Dimensional ArrayList:-
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list2.add(list);
		list2.add(list);
		System.out.println(list2);
	}
}
