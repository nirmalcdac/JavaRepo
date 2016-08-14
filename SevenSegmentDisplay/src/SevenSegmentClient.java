public class SevenSegmentClient {
	public static void main(String[] args) {
		boolean flag = false;
		int sum;
		int[][] matrix = { { 1, 1, 1, 0, 1, 1, 1, 1, 0 }, { 1, 1, 0, 0, 0, 0, 0, 1, 0 }, { 0, 1, 1, 1, 1, 1, 0, 1, 0 },
				{ 1, 1, 1, 1, 1, 0, 0, 1, 0 }, { 1, 1, 0, 1, 0, 0, 1, 1, 0 }, { 1, 0, 1, 1, 1, 0, 1, 1, 0 },
				{ 1, 0, 1, 1, 1, 1, 1, 1, 0 }, { 1, 1, 0, 0, 1, 0, 0, 1, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 1, 1, 1, 0 } };
		int[] weight = { 0, 0, 0, 0, 0, 0, 0, 0 };
		while (flag != true) {
			for (int i = 0; i < 10; i++) {
				sum = 0;
				for (int j = 0; j < 8; j++) {
					sum = sum + matrix[i][j] * weight[j];
				}
				if ((sum == matrix[i][8]) || ((matrix[i][8] == 1) && (sum >= 1))
						|| ((matrix[i][8] == 0) && (sum <= 0))) {
					System.out.println("actual and expected is same for the row no." + i);
				} else {
					System.out.println("actual and expected is different for the row no." + i);
					for (int k = 0; k < 8; k++) {
						if (sum < matrix[i][8]) {
							weight[k] += matrix[i][k];
						} else if (sum > matrix[i][8]) {
							weight[k] -= matrix[i][k];
						}
					}
				}
				printWeights(weight);
				flag = checkforvalidweight(weight, matrix);
			}
		}
	}

	private static void printWeights(int[] weight) {
		System.out.println("THE NEW WEIGHT VALUES ARE ------>");
		for (int k = 0; k < 8; k++) {
			System.out.println(weight[k]);
		}
	}

	private static boolean checkforvalidweight(int[] weight, int[][] matrix) {
		boolean flag = false;
		int sum, count = 0;
		int i = 0;
		while (i < 10)
			for (i = 0; i < 10; i++) {
				sum = 0;
				for (int j = 0; j < 8; j++) {
					sum += matrix[i][j] * weight[j];
				}
				System.out.println("the sum of row" + i + "is -- " + sum);
				if (sum != matrix[i][8]) {
					flag = false;
				}
				if ((sum == matrix[i][8]) || ((matrix[i][8] == 1) && (sum >= 1))
						|| ((matrix[i][8] == 0) && (sum <= 0))) {
					count++;
				}
			}
		if (count == 10) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
}