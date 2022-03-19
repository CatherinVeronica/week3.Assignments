package week3.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] array = test.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			String word = " ";
			int a = i % 2;
			if (a != 0) {
				String value= array[i];
				for (int j = value.length()-1;j>=0; j--) {
					char rev = value.charAt(j);
					word = word + rev;
					
				}
				System.out.println(word);
			}else {
				System.out.println(array[i]);
			}
			
		}

	}

}
