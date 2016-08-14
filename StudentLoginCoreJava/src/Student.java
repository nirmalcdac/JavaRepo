import java.util.Scanner;

public class Student {
	public static void main(String args[]) throws Exception {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Moodle m = new Moodle();
		m.login();
		m.show_courses();
		System.out.println("choose course");
		String course = in.nextLine();
		m.select_course(course);
		m.select_file();
		logout();
	}

	private static void logout() {
		System.out.println("Successfully logged out");
	}

}
