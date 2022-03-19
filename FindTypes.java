package week3.assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = " $$ Welcome to 2nd Class Of Automation $$";
		int letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;
		char[] array = test.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (Character.isLetter(array[i])) {
				letter = letter + 1;
				
			}else if (Character.isDigit(array[i])) {
				num = num + 1;
							}else if (Character.isSpaceChar(array[i]) ) {
								space= space + 1;
							}else {
								specialChar = specialChar + 1;
							}
		}
		System.out.println("letter:"+ letter);
		System.out.println("number:"+ num);
		System.out.println("space:"+ space);
		System.out.println("specialChar:"+ specialChar);
		

	}

}
