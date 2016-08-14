package hop_field;

import java.util.Arrays;

public class HopField {
	int[] K = { -1, -1, +1, -1, -1, -1, +1, +1, +1, -1, -1, +1, +1, +1, -1, -1, +1, -1, +1, -1, -1, -1, -1, -1, -1 };

	int[] L = { -1, -1, +1, -1, -1, -1, +1, +1, +1, -1, -1, +1, +1, +1, -1, -1, +1, +1, -1, -1, -1, -1, -1, -1, -1 };

	int[] V = { -1, -1, +1, -1, -1, -1, +1, +1, -1, -1, -1, +1, +1, -1, -1, -1, +1, +1, -1, -1, -1, -1, +1, -1, -1 };

	int[] R = { -1, -1, +1, +1, -1, -1, -1, -1, +1, -1, -1, -1, +1, +1, -1, -1, -1, +1, +1, -1, -1, -1, -1, +1, -1 };

	int[] F = { -1, +1, +1, -1, -1, -1, +1, +1, -1, -1, -1, -1, -1, -1, -1, -1, -1, +1, +1, -1, -1, -1, +1, +1, -1 };

	int[] E = { -1, -1, +1, -1, -1, -1, +1, +1, -1, -1, -1, +1, +1, -1, -1, -1, +1, +1, -1, -1, -1, -1, +1, +1, -1 };

	int[][] weightK = new int[25][25];
	int[][] weightL = new int[25][25];
	int[][] weightV = new int[25][25];
	int[][] weightR = new int[25][25];
	int[][] weightF = new int[25][25];
	int[][] weightE = new int[25][25];

	int[][] weightMatrix = new int[25][25];
	int[] noiseMatrix = { -1, -1, +1, -1, -1, -1, +1, +1, +1, -1, -1, +1, +1, +1, -1, -1, +1, +1, -1, -1, -1, -1, -1,
			-1, -1 };
	int[] newMatrix = new int[25];
	int done = 0;

	public HopField() {
		weightK = multiply(K);
		weightL = multiply(L);
		weightV = multiply(V);
		weightR = multiply(R);
		weightF = multiply(F);
		weightE = multiply(E);

		addAll();
		subtract();
		while (done != 1) {
			multiplyNoise();

			checkAlphabet();
			System.out.println(" ");
		}

	}

	private void subtract() {
		// TODO Auto-generated method stub
		int ss = 0;
		do {
			weightMatrix[ss][ss] = weightMatrix[ss][ss] - 6;
			ss++;
		} while (ss < 25);
		for (int aa = 0; aa < 25; aa++) {
			for (int bb = 0; bb < 25; bb++) {
				if (weightMatrix[aa][bb] < 0)
					System.out.print("   " + weightMatrix[aa][bb]);
				else
					System.out.print("    " + weightMatrix[aa][bb]);
			}
			System.out.println(" ");
		}
	}

	private void addAll() {
		// TODO Auto-generated method stub
		for (int aa = 0; aa < 25; aa++) {
			for (int bb = 0; bb < 25; bb++) {
				weightMatrix[aa][bb] = weightK[aa][bb] + weightL[aa][bb] + weightV[aa][bb] + weightR[aa][bb]
						+ weightF[aa][bb] + weightE[aa][bb];

			}

		}

	}

	public int[][] multiply(int[] array) {
		int[][] tempArray = new int[25][25];
		int s = 0;
		int tValue = 0;
		int sum = 0;

		for (int aa = 0; aa < 25; aa++) {
			for (int bb = 0; bb < 25; bb++) {

				tempArray[aa][bb] = array[tValue] * array[bb];

			}
			tValue++;
			System.out.println(" ");
		}
		return tempArray;
	}

	public void multiplyNoise() {

		int sum = 0;
		for (int j = 0; j < 25; j++) {
			sum = 0;
			for (int i = 0; i < 25; i++) {
				if (j != i) {
					sum = sum + (noiseMatrix[i] * weightMatrix[j][i]);
				}
			}

			newMatrix[j] = sum;
		}

	}

	public void checkAlphabet() {

		int[] tempMatrix = new int[25];
		for (int aa = 0; aa < 25; aa++) {
			if (newMatrix[aa] < 0) {
				tempMatrix[aa] = -1;
			} else if (newMatrix[aa] > 0) {
				tempMatrix[aa] = 1;
			}
		}
		if (Arrays.equals(noiseMatrix, tempMatrix)) {
			done = 1;
		} else {
			noiseMatrix = tempMatrix;
		}
		System.out.println("new noise matrix:");
		for (int aa = 0; aa < 25; aa++) {
			System.out.print("   " + noiseMatrix[aa]);

		}
		System.out.println(" ");
		if (Arrays.equals(noiseMatrix, K)) {
			System.out.println("Closest match is K");
		} else if (Arrays.equals(noiseMatrix, L)) {
			System.out.println("Closest match is L");
		} else if (Arrays.equals(noiseMatrix, V)) {
			System.out.println("Closest match is V");
		} else if (Arrays.equals(noiseMatrix, R)) {
			System.out.println("Closest match is R");
		} else if (Arrays.equals(noiseMatrix, F)) {
			System.out.println("Closest match is F");
		} else if (Arrays.equals(noiseMatrix, E)) {
			System.out.println("Closest match is E");
		} else {
			System.out.println("No match found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HopField h = new HopField();

	}
}