package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 3,2,11,4,5,6,7);
		List<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2, 1,2,8,4,9,7);
		
		OUTER_LOOP:
			for (int i = 0; i < list1.size(); i++) {
				int a = list1.get(i);
				for (int j = 0; j < list2.size(); j++) {
					int b = list2.get(j);
					
					if (a==b) {
						System.out.println(a);
						break OUTER_LOOP ;
					}
				}
			}
	}

}
