import java.util.Scanner;

public class Moodle {
	Teacher t = new Teacher();
	Database d = new Database();
	Scanner in = new Scanner(System.in);
	String username, password;
	String name = "nirmal";

	public void login() {
		System.out.println("enter username");
		username = in.nextLine();
		System.out.println("enter password");
		password = in.nextLine();
		if ((username.equals(name)) && (password.equals(name))) {
			System.out.println("successfully logged in");
		} else {
			System.out.println("invalid username and password");
			System.exit(0);
		}
	}

	public void show_courses() {
		d.show_courses();
	}

	public void select_course(String course) {
		System.out.println("selected course is " + course);
	}

	public void select_file() {
		System.out.println("give file name");
		String filename = null;
		filename = in.nextLine();
		int size = 0;
		do {
			System.out.println("give size of the file. file size should be less then 3 mb");
			size = in.nextInt();
		} while (size > 3);
		int time1 = 10;
		System.out.println("give time of now as integer value");
		int time2 = in.nextInt();
		if (time1 < time2) {
			System.out.println("time over");
		} else {
			System.out.println("Congrats stil you have time");
		}
		System.out.println("file name is " + filename + " size is " + size + " mb");
		d.upload_file(filename);
		send_mail_to_teacher();
	}

	private void send_mail_to_teacher() {
		t.sendmail();
		System.out.println("mail sent to teacher");
	}
}
