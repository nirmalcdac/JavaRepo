import java.util.Scanner;

public class RoseIndia {
	static class Node {
		Node left;
		Node right;
		int score;
		String employeeID;
		String employeeName;
		String managerID;

		public Node(String employeeID, String employeeName, String managerID, int score) {
			this.score = score;
			this.employeeID = employeeID;
			this.employeeName = employeeName;
			this.managerID = managerID;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of lines");
		Scanner input = new Scanner(System.in);
		String numberOfElementsString = input.nextLine();
		int numberOfElements = Integer.parseInt(numberOfElementsString);
		String[] stringInput = new String[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print("Input Element" + (i + 1) + ": \n");
			stringInput[i] = input.nextLine();
		}
		input.close();
		int totalBonus = Integer.parseInt(stringInput[0]);
		
		new RoseIndia().run(stringInput, numberOfElements);
	}

	public void run(String[] stringInput, int numberOfElements) {
		Node rootnode = null;
		for (int i = 1; i < numberOfElements; i++) {
			String temp[] = stringInput[i].split(",");
			int score = Integer.parseInt(temp[3]);
			if (temp[2].equals("-1")) {
				rootnode = new Node(temp[0], temp[1], temp[2], score);
			} else {
				insert(rootnode, temp[0], temp[1], temp[2], score);
			}
		}
	}

	public void insert(Node node, String employeeID, String employeeName, String managerID, int score) {
		if (managerID == node.employeeID) {
			if (node.left == null) {
				node.left = new Node(employeeID, employeeName, managerID, score);
				System.out.println("left inserted");
			} else if (node.right == null) {
				node.right = new Node(employeeID, employeeName, managerID, score);
				System.out.println("Right inserted");
			}
		}
	}
}