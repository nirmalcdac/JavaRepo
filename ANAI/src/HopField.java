
public class HopField {
	// A
	static int pattern1[] = { -1, -1, 1, -1, -1, -1, 1, -1, 1, -1, 1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, 1, 1,
			-1, -1, -1, 1 };
	// I
	static int pattern2[] = { 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1,
			1, 1, 1, 1, 1 };
	// X
	static int pattern3[] = { 1, -1, -1, -1, 1, -1, 1, -1, 1, -1, -1, -1, 1, -1, -1, -1, 1, -1, 1, -1, 1, -1, -1, -1, 1,
			1, -1, -1, -1, 1 };
	// Y
	static int pattern4[] = { 1, -1, -1, -1, 1, -1, 1, -1, 1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1,
			-1, -1, -1, 1, -1, -1 };

	final static int M = 4;
	final static int STARTFROM = 0;

	public static void main(String[] args) {
		boolean change = false;
		int result1[][] = new int[30][30];
		int result2[][] = new int[30][30];
		int result3[][] = new int[30][30];
		int result4[][] = new int[30][30];
		int weight[][] = new int[30][30];
		int previousInput[] = new int[30];
		int elementInCycle;
		// noisy input
		int input[] = { 1, 1, 1, 1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, 1,
				1, 1, 1, 1 };

		transposeAndMultiply(pattern1, result1);
		transposeAndMultiply(pattern2, result2);
		transposeAndMultiply(pattern3, result3);
		transposeAndMultiply(pattern4, result4);

		sum(result1, result2, result3, result4, weight);
		subtractDiagonalMatrix(weight, M);
		elementInCycle = STARTFROM;
		do {
			initializePreviousInput(previousInput, input);
			System.out.println("\n Old value:");
			printInput(previousInput);
			// 1 full iteration
			do {
				getNewInput(input, elementInCycle, weight);
				elementInCycle++;
				if (elementInCycle == 30)
					elementInCycle = 0;
			} while (elementInCycle != STARTFROM);

			change = isChanged(previousInput, input);
			System.out.println("\n New value:");
			printInput(input);
			System.out.println("\n Change: " + change);

		} while (change);

		System.out.println();
		if (isMatching(input, pattern1))
			System.out.println("The given noisy input matches with alphabet A");
		else if (isMatching(input, pattern2))
			System.out.println("The given noisy input matches with alphabet I");
		else if (isMatching(input, pattern3))
			System.out.println("The given noisy input matches with alphabet X");
		else if (isMatching(input, pattern4))
			System.out.println("The given noisy input matches with alphabet Y");
		else
			System.out.println("The given noisy input does not match with any input alphabet. ");
	}

	private static boolean isMatching(int[] input, int[] pattern) {
		for (int i = 0; i < 30; i++)
			if (input[i] != pattern[i])
				return false;
		return true;
	}

	private static void printInput(int[] input) {
		for (int i = 0; i < 30; i++)
			if (input[i] >= 0)
				System.out.print("+" + input[i] + " ");
			else
				System.out.print(input[i] + " ");
	}

	private static boolean isChanged(int[] previousInput, int[] input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++)
			if (previousInput[i] != input[i])
				return true;
		return false;
	}

	private static void initializePreviousInput(int[] previousInput, int[] input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++)
			previousInput[i] = input[i];
	}

	private static void getNewInput(int[] input, int elementInCycle, int[][] weight) {
		int sum = 0;
		int threshold = 0;

		for (int i = 0; i < 30; i++)
			if (i != elementInCycle)
				sum += weight[elementInCycle][i] * input[i];

		if (sum > threshold)
			input[elementInCycle] = 1;
		else if (sum < threshold)
			input[elementInCycle] = -1;
	}

	private static void subtractDiagonalMatrix(int[][] result, int m) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++)
			for (int j = 0; j < 30; j++)
				if (i == j)
					result[i][j] -= m * 1;
	}

	private static void sum(int[][] result1, int[][] result2, int[][] result3, int[][] result4, int[][] result) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++)
			for (int j = 0; j < 30; j++)
				result[i][j] = result1[i][j] + result2[i][j] + result3[i][j] + result4[i][j];
	}

	private static void transposeAndMultiply(int[] pattern, int[][] result) {
		// TODO Auto-generated method stub
		int input[][] = new int[30][1];
		int transpose[][] = new int[1][30];
		int i, j;

		// input
		for (i = 0; i < 30; i++)
			for (j = 0; j < 1; j++)
				input[i][j] = pattern[i];

		// input's transpose
		for (i = 0; i < 1; i++)
			for (j = 0; j < 30; j++)
				transpose[i][j] = pattern[j];

		// multiply input and its transpose
		for (i = 0; i < 30; i++)
			for (j = 0; j < 30; j++)
				result[i][j] = input[i][0] * transpose[0][j];

	}
}
