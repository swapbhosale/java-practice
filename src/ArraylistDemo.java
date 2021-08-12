import java.util.*;

public class ArraylistDemo {
	public static void mian(String[] args) {
		createList();
	}

	public static void createList() {
		List<Integer> numbers =new ArrayList<Integer>();
		numbers.add(1);
		System.out.println(numbers.get(0));
		for (int count=0; count <20 ; count++) {
			numbers.add(count);
		}
	}

}
