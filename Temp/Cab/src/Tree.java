import java.util.Scanner;

public class Tree {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String numberOfElementsString = input.nextLine();
		int numberOfElements = Integer.parseInt(numberOfElementsString);
		String[] num = new String[numberOfElements];
		String finalString[][] = new String[numberOfElements][4];

		for (int i = 0; i < numberOfElements; i++) {
			System.out.print("Input Element" + (i + 1) + ": ");
			num[i] = input.nextLine();
		}

		input.close();

		for (int i = 1; i < numberOfElements; i++) {
			String temp[] = num[i].split(",");
			for (int j = 0; j < 4; j++) {
				finalString[i][j] = temp[j];
			}
		}

		for (int i = 1; i < numberOfElements; i++) {
			System.out.println(finalString[i][2]);
		}
	}
}