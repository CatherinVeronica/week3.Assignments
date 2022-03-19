package week3.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] text1 = text.split(" ");
	String S = " ";
	Set<String> str = new LinkedHashSet<String>();
	for (int i = 0; i < text1.length; i++) {
		str.add(text1[i]);
	}
	List<String> list = new ArrayList<String>(str);
	for (int i = 0; i < list.size(); i++) {
		S = S + list.get(i);
	}
System.out.println(S);
	}

}
