package week3.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "posts";
		
		if (text1.length() == text2.length()) {
			char[] array1 = text1.toCharArray();
			char[] array2 = text2.toCharArray();
			Arrays.sort(array2);
			Arrays.sort(array1);
			for (int i = 0; i < array1.length; i++) {
				int count = 0 ;
				for (int j = i; j < array2.length; j++) {
					
					if (array1[i]== array2[j]) {
						count = count+ 1;
					}
				}
				if (count == array1.length ) {
					System.out.println("Word is a Anagram");
				}
			}
			
			
		}
	}

}
