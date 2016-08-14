
public class ANDPerceptron {

	public static void main(String[] args) {
		int i = 0, j = 0, k;
		int sum = 0;
		int expectedOutput;
		int weightVector[] = { 0, 0, 0 };
		int inputVector[] = new int[3];
		int ANDtable[][] = new int[4][3];
		ANDtable[0] = new int[] { 0, 0, 1 };
		ANDtable[1] = new int[] { 0, 1, 1 };
		ANDtable[2] = new int[] { 1, 0, 1 };
		ANDtable[3] = new int[] { 1, 1, 1 };
		boolean result[] = { false, false, false, false };
		boolean flag = false;

		while (!flag) {
			while (i < 4) {
				setInputVector(inputVector, ANDtable[i]);
				sum = calculateSum(inputVector, weightVector);
				expectedOutput = AND(inputVector[0], inputVector[1]);

				if (sum > expectedOutput)
					performSubtraction(inputVector, weightVector);
				else if (sum < expectedOutput)
					performAddition(inputVector, weightVector);
				else
					result[i] = true;
				i++;

			}
			flag = result[0] & result[1] & result[2] & result[3];
			if (!flag && i == 4) {
				i = 0;
				for (k = 0; k < 4; k++)
					result[k] = false;
			}
		}
		System.out.println("Final weight vector");
		for (i = 0; i < 3; i++)
			System.out.print(weightVector[i] + "	");

	}

	private static void performAddition(int[] inputVector, int[] weightVector) {
		for (int i = 0; i < 3; i++)
			weightVector[i] = inputVector[i] + weightVector[i];
	}

	private static void performSubtraction(int[] inputVector, int[] weightVector) {
		for (int i = 0; i < 3; i++)
			weightVector[i] = weightVector[i] - inputVector[i];

	}

	private static void setInputVector(int[] inputVector, int[] ANDtable) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++)
			inputVector[i] = ANDtable[i];
	}

	public static int AND(int a, int b) {
		return (a & b);
	}

	public static int calculateSum(int inputVector[], int weightVector[]) {
		int sum = 0;
		for (int i = 0; i < 3; i++)
			sum += inputVector[i] * weightVector[i];
		if (sum >= 1)
			sum = 1;
		else if (sum <= -1)
			sum = 0;
		return sum;
	}

}
