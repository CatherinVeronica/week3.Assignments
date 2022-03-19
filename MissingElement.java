package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1,2,3,4,7,6,8);
Collections.sort(list);

for (int i = list.get(0); i < list.size(); i++) {
	list.get(i);
	if (i!=list.get(i)) {
		System.out.println(list.get(i));
		break;
		
	}
}
	}

}
