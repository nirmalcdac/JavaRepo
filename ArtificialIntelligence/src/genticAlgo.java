public class genticAlgo {
	public static void main(String[] args) {
		int[][] ai = { { 1, 0, 1 }, { 0, 0, 1 }, { 0, 1, 0 }, { 1, 1, 0 } };
		int i, j;
		int fi[] = findfi(ai);
		int sum = suumation(fi);
		float pi[] = findpi(fi, sum);
		float pisum = 0, apisum = 0;
		System.out.println(" " + "i" + "  " + "fi     " + "pi      " + "n.pi   ");
		for (i = 0; i < 4; i++) {
			System.out.println(" " + (i + 1) + "  " + fi[i] + "   " + pi[i] + "  " + 4 * pi[i]);
			pisum = pisum + pi[i];
			apisum = apisum + 4 * pi[i];
		}
		System.out.println("" + "Tot " + sum + "     " + pisum + "        " + apisum);
		System.out.println(
				"" + "avg" + " " + (float) sum / 4 + "    " + (float) pisum / 4 + "       " + (float) apisum / 4);
		int maxfi = fi[0];
		for (i = 0; i < 4; i++) {
			if (maxfi < fi[i]) {
				maxfi = fi[i];
			}
		}
		float maxpi = pi[0];
		for (i = 0; i < 4; i++) {
			if (maxpi < pi[i]) {
				maxpi = pi[i];
			}
		}
		float namxpi = 4 * pi[0];
		for (i = 0; i < 4; i++) {
			if (namxpi < 4 * pi[i]) {
				namxpi = 4 * pi[i];
			}
		}
		System.out.println("Max " + maxfi + "   " + maxpi + "  " + namxpi);
		System.out.println("");
		System.out.println("RandonNo" + "   " + "Probability" + "  " + "StringNoi");
		int randomnum[] = new int[4];
		for (i = 0; i < 4; i++) {
			if (i == 0) {
				randomnum[i] = (int) (pi[i] * 1000 - 1);
				System.out.println("000-" + randomnum[i] + "      " + pi[i] + "     " + (i + 1));
			} else {
				randomnum[i] = randomnum[i - 1] + (int) (pi[i] * 1000);
				System.out.println("" + +randomnum[i] + "      " + pi[i] + "     " + (i + 1));
			}
		}
	}

	private static float[] findpi(int[] fi, int sum) {
		float temp[] = new float[4];
		for (int i = 0; i < 4; i++) {
			temp[i] = (float) fi[i] / sum;
		}
		return temp;
	}

	private static int suumation(int[] fi) {
		int sum = 0;
		for (int i = 0; i < fi.length; i++) {
			sum = sum + fi[i];
		}
		return sum;
	}

	private static int[] findfi(int[][] ai) {
		int i, j;
		int temp[] = new int[4];
		for (i = 0; i < 4; i++) {
			int sum = 0;
			for (j = 0; j < 3; j++) {
				if (j == 0) {
					sum = sum + 4 * ai[i][j];
				} else if (j == 1) {
					sum = sum + 2 * ai[i][j];
				} else {
					sum = sum + 1 * ai[i][j];
				}
			}
			temp[i] = sum;
		}
		return temp;
	}
}