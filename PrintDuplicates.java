package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list,14,12,13,11,15,14,18,16,17,19,18,17,20);
				OUTER_LOOP:
			for (int i = 0; i < list.size(); i++) {
				int count = 0;
				int a = list.get(i);
				for (int j = i; j < list.size(); ++j) {
					int b = list.get(j);
					if (a==b) {
						count = count + 1;
					}
				}
				if (count>1) {
					System.out.println(a);
					break OUTER_LOOP;
				}
				
				
			}
	}

}
