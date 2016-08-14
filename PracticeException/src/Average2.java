public class Average2 {
	public static void main(String[] args) throws Exception {
		printAverage(100, 0);
		System.out.println("Exit main()."); // (2)
	}

	public static void printAverage(int totalSum, int totalNumber) {
		try { // (3)
			int average = computeAverage(totalSum, totalNumber);// (4)
			System.out.println("Average = " + totalSum + " / " + totalNumber + " = " + average);
		} catch (ArithmeticException ae) { // (6)
			ae.printStackTrace(); // (7)
			System.out.println("Exception handled in " + "printAverage()."); // (8)
		}
		System.out.println("Exit printAverage()."); // (9)
	}

	public static int computeAverage(int sum, int number) {
		int avg = 0;
		System.out.println("Computing average."); // (10)
		try {
			avg = sum / number; // (11)

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Exception handled in " + "compute avg().");
		}
		return avg;
	}
}