package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 3,2,11,4,6,7);
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));

		
	}

}
