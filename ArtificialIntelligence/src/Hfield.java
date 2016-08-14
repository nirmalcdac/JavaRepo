public class Hfield {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 1, 1, 1, 1, 1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, 1, 1, -1, -1, -1, 1 };
		int[] I = { 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, 1, 1, 1, 1, 1 };
		int[] X = { 1, -1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, 1, -1, -1, -1, 1, -1, 1, -1, 1, -1, -1, -1, 1 };
		int[] Y = { 1, -1, -1, -1, 1, -1, 1, -1, 1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1 };
		int[][] A1 = new int[25][25];
		int[][] I1 = new int[25][25];
		int[][] X1 = new int[25][25];
		int[][] Y1 = new int[25][25];
		A1 = matrix_multiply(A);
		I1 = matrix_multiply(I);
		X1 = matrix_multiply(X);
		Y1 = matrix_multiply(Y);
		int[][] ADD = new int[25][25];
		int[][] DM = new int[25][25];
		int[][] Waight = new int[25][25];
		ADD = add_matrix(A1, I1, X1, Y1);
		int m = 4;// number of matrices
		DM = generate_digonal(m);
		System.out.println("this is add matrix");
		printm(ADD);
		System.out.println("this is digonal matrix");
		printm(DM);
		Waight = subtract_matrix(ADD, DM);
		printm(Waight);
		int[] inp_vec = { -1, -1, -1, 1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, 1, 1, 1, 1, 1 };
		int[] final_vec = new int[25];
		check_noice(Waight, final_vec, inp_vec, A, I, X, Y);
	}

	private static void check_noice(int[][] waight, int[] final_vec, int[] inp_vec, int[] a, int[] i2, int[] x,
			int[] y) {
		int val = 0;
		do {
			final_vec = noice_can(waight, inp_vec);
			for (int i = 0; i < 25; i++)
				if (final_vec[i] == inp_vec[i])
					val = 1;
				else
					val = 0;
			for (int i = 0; i < 25; i++)
				inp_vec[i] = final_vec[i];
		} while (val == 0);

		System.out.println("input matched with 'Input vector' ");
		for (int i = 0; i < 25; i++) {
			if (final_vec[i] == a[i]) {
				val = 1;
			} else {
				val = 0;
			}
		}
		if (val == 1) {
			System.out.println("input matched with 'A' ");
		}
		for (int i = 0; i < 25; i++) {
			if (final_vec[i] == i2[i]) {
				val = 1;
			} else {
				val = 0;
			}
		}
		if (val == 1) {
			System.out.println("input matched with 'I' ");
		}
		for (int i = 0; i < 25; i++) {
			if (final_vec[i] == x[i]) {
				val = 1;
			} else {
				val = 0;
			}
		}
		if (val == 1) {
			System.out.println("input matched with 'X' ");
		}
		for (int i = 0; i < 25; i++) {
			if (final_vec[i] == y[i]) {
				val = 1;
			} else {
				val = 0;
			}
		}
		if (val == 1) {
			System.out.println("input matched with 'Y' ");
		}

		print1m(final_vec);

	}

	private static void print1m(int[] final_vec) {
		int i;
		for (i = 0; i < 25; i++) {
			System.out.print(" " + final_vec[i]);
		}
	}

	private static int[] noice_can(int[][] waight, int[] inp_vec) {
		int[] temp = new int[25];
		int i, j;
		for (i = 0; i < 25; i++) {
			int sum = 0;
			for (j = 0; j < 25; j++) {
				int x = waight[i][j] * inp_vec[j];
				sum = sum + x;
			}
			System.out.println(sum);
			if (sum > 0) {
				temp[i] = 1;
			} else if (sum == 0) {
				temp[i] = inp_vec[i];
			} else {
				temp[i] = -1;
			}
		}
		return temp;
	}

	private static int[][] subtract_matrix(int[][] aDD, int[][] dM) {
		int[][] temp = new int[25][25];
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++) {
				temp[i][j] = aDD[i][j] - dM[i][j];
			}
			System.out.println("\n");
		}
		return temp;
	}

	private static int[][] generate_digonal(int m) {
		int[][] temp = new int[25][25];
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++) {
				if (i == j) {
					temp[i][j] = 1 * m;
				} else {
					temp[i][j] = 0;
				}
			}
			System.out.println("\n");
		}
		return temp;

	}

	private static void printm(int[][] aDD) {
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++) {
				System.out.print(aDD[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}

	private static int[][] add_matrix(int[][] a1, int[][] i1, int[][] x1, int[][] y1) {
		int[][] temp = new int[25][25];
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++) {
				temp[i][j] = (a1[i][j] + i1[i][j] + x1[i][j] + y1[i][j]);
			}

		}
		return temp;
	}

	private static int[][] matrix_multiply(int[] a) {
		int[][] temp = new int[25][25];
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++) {
				temp[i][j] = a[i] * a[j];
			}

		}
		return temp;
	}
}
