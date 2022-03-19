package week3.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String input = "madam";
		String rev = " ";
		
		for (int i = input.length()-1; i >=0 ; i--) {
			rev = rev + input.charAt(i);
		}
		input.equalsIgnoreCase(rev);
if (true) {
	System.out.println("Word is Palindrome");
}
	}

}
