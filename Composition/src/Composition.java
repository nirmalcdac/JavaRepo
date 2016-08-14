import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Composition {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of the university: ");
		String univ = br.readLine();
		University newUniv = new University(univ, 100, "Physics");
		int opt = 0;
		do {
			System.out.println("\t\tMenu\n\t(1)--Add department\n\t(2)--Show university list\n\t(3)--Exit\n");
			System.out.print("Enter the option: ");
			opt = Integer.parseInt(br.readLine());
			switch (opt) {
			case 1:
				System.out.print("Enter the department id: ");
				int id = Integer.parseInt(br.readLine());
				System.out.print("Enter the department name: ");
				String name = br.readLine();
				newUniv.addDepartment(id, name);
				break;

			case 2:
				newUniv.showList();
				break;

			case 3:
				break;

			default:
				System.out.print("Invalid option.");
			}
		} while (opt != 3);
	}
}