package week3.assignments;

public class NoofOccurences {

	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		int count = 0;
		String str1= str.toUpperCase();
		char[] array = str1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i]==array[3]) {
				count =count + 1;
				
			}
		}
System.out.println("No of Occurences" + count);
	}

}
