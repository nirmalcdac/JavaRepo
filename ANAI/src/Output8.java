
public class Output8 {
	static int NUMBER = 8;
	final static int ROW = 10;
	final static int COLUMN = 8;

	public static void main(String[] args) {
		int i = 0, j = 0, k;
		int sum = 0;
		int expectedOutput;
		int weightVector[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int inputVector[] = new int[9];
		int segmentTable[][] = { { 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0, 0, 0, 1 }, { 0, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 1, 1, 1, 1, 0, 0, 1 }, { 1, 1, 0, 1, 0, 0, 1, 1 }, { 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 0, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 1, 1, 1 } };

		boolean result[] = new boolean[10];
		boolean flag = false;

		setToFalse(result);
		while (!flag) {
			while (i < ROW) {
				setInputVector(inputVector, segmentTable[i]);
				sum = calculateSum(inputVector, weightVector);
				expectedOutput = getOutput(inputVector, i);
				if (sum > expectedOutput)
					performSubtraction(inputVector, weightVector);
				else if (sum < expectedOutput)
					performAddition(inputVector, weightVector);
				else
					result[i] = true;
				i++;

			}
			flag = result[0];
			for (k = 1; k < ROW; k++)
				flag = flag & result[k];
			if (!flag && i == ROW) {
				i = 0;
				setToFalse(result);
			}
		}
		System.out.println("Final weight vector");
		for (i = 0; i < COLUMN; i++)
			System.out.print(weightVector[i] + "	");

	}

	private static void setToFalse(boolean[] result) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ROW; i++)
			result[i] = false;
	}

	private static void performAddition(int[] inputVector, int[] weightVector) {
		for (int i = 0; i < COLUMN; i++)
			weightVector[i] = inputVector[i] + weightVector[i];
	}

	private static void performSubtraction(int[] inputVector, int[] weightVector) {
		for (int i = 0; i < COLUMN; i++)
			weightVector[i] = weightVector[i] - inputVector[i];

	}

	private static void setInputVector(int[] inputVector, int[] segmentTable) {
		// TODO Auto-generated method stub
		for (int i = 0; i < COLUMN; i++)
			inputVector[i] = segmentTable[i];
	}

	public static int getOutput(int inputVector[], int index) {
		if (index == NUMBER)
			return 1;
		return 0;
	}

	public static int calculateSum(int inputVector[], int weightVector[]) {
		int sum = 0;
		for (int i = 0; i < COLUMN; i++)
			sum += inputVector[i] * weightVector[i];
		if (sum >= 1)
			sum = 1;
		else if (sum <= -1)
			sum = 0;
		return sum;
	}

}
