package week3.assignments;

public class Students {
	 public static void getStudentInfo(int id) {
		System.out.println("id is" + id);

	}
	 public static void getStudentInfo(int id, String name) {
			System.out.println("id is" + id + "name is" + name);

		}
	 public static void getStudentInfo(String email, long phonenumber) {
		System.out.println("email is" + email + "PhoneNumber is" + phonenumber);

	}

	public static void main(String[] args) {
		getStudentInfo(12);
		getStudentInfo(121, "meby");
		getStudentInfo("catherinmaryveronica@gmail.com", 9080453787L);

	}

}
