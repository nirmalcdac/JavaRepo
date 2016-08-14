import java.util.Random;

public class JobShop {

	final static int SIZE = 4;
	final static int initialPopulation[] = { 5, 1, 2, 6 };
	final static float fitness[] = { 5, 1, 2, 6 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi[] = new float[SIZE];
		float npi[] = new float[SIZE];
		int randomInterval[][] = new int[SIZE][3];
		int newPopulation[] = new int[SIZE];
		int actualCount[] = new int[SIZE];
		int mateNo[] = new int[SIZE];
		int crossOver[] = new int[SIZE];
		float F = 0;
		boolean flag = false;
		int i, j, randomNumbers;
		while (!flag) {

			System.out.println("Initial Population");
			for (i = 0; i < SIZE; i++)
				System.out.println(initialPopulation[i]);

			for (i = 0; i < SIZE; i++) {
				fitness[i] = initialPopulation[i];
				actualCount[i] = 0;
			}

			F = 0;
			// summation of fitness
			for (i = 0; i < SIZE; i++)
				F += fitness[i];

			// calculating pi and npi
			for (i = 0; i < SIZE; i++) {
				pi[i] = fitness[i] / F;
				pi[i] = (float) (Math.round(pi[i] * 1000.0) / 1000.0);
				npi[i] = SIZE * pi[i];
				npi[i] = (float) (Math.round(npi[i] * 1000.0) / 1000.0);
			}
			for (i = 0; i < SIZE; i++) {
				if (i == 0)
					randomInterval[i][0] = 000;
				else
					randomInterval[i][0] = randomInterval[i - 1][1] + 1;

				randomInterval[i][1] = randomInterval[i][0] + (int) (pi[i] * 1000) - 1;
				randomInterval[i][2] = (i + 1);
			}

			Random randomGenerator = new Random();
			for (i = 0; i < 4; ++i) {
				randomNumbers = randomGenerator.nextInt(1000);
				if (randomNumbers > randomInterval[0][0] && randomNumbers < randomInterval[0][1])
					actualCount[0]++;
				else if (randomNumbers > randomInterval[1][0] && randomNumbers < randomInterval[1][1])
					actualCount[1]++;
				else if (randomNumbers > randomInterval[2][0] && randomNumbers < randomInterval[2][1])
					actualCount[2]++;
				else if (randomNumbers > randomInterval[3][0] && randomNumbers < randomInterval[3][1])
					actualCount[3]++;
			}
			j = 0;
			for (i = 0; i < SIZE; i++) {
				System.out.println("actual count " + actualCount[i]);
				if (actualCount[i] == 1) {
					newPopulation[j] = initialPopulation[i];
					j++;

				} else if (actualCount[i] == 2) {
					newPopulation[j] = initialPopulation[i];
					newPopulation[j++] = initialPopulation[i];
					j++;
				}
			}
			j = 3;
			int k = 0;
			for (i = 0; i < SIZE; i++) {
				mateNo[i] = j;
				j--;
				crossOver[i] = k;
				k++;
				if (k == 2)
					k = 0;
			}
			String b1, b2;
			StringBuilder newb1, newb2;
			char ch;
			int mateIndex;
			for (i = 0; i < 2; i++) {
				b1 = Integer.toBinaryString(newPopulation[i]);
				mateIndex = mateNo[i];
				b2 = Integer.toBinaryString(newPopulation[mateIndex]);

				newb1 = new StringBuilder(b1);

				newb1 = setInBinary(newb1);
				newb2 = new StringBuilder(b2);

				newb2 = setInBinary(newb2);
				switch (crossOver[i]) {
				case 0:
					ch = newb1.charAt(0);
					newb1.setCharAt(0, newb2.charAt(0));
					newb2.setCharAt(0, ch);
					newPopulation[i] = Integer.parseInt(newb1.toString(), 2);
					newPopulation[mateIndex] = Integer.parseInt(newb2.toString(), 2);
					break;

				case 1:
					ch = newb1.charAt(0);
					newb1.setCharAt(0, newb2.charAt(0));
					newb2.setCharAt(0, ch);

					ch = newb1.charAt(1);
					newb1.setCharAt(1, newb2.charAt(1));
					newb2.setCharAt(1, ch);
					newPopulation[i] = Integer.parseInt(newb1.toString(), 2);
					newPopulation[mateIndex] = Integer.parseInt(newb2.toString(), 2);
				}

			}

			for (i = 0; i < SIZE; i++)
				if (newPopulation[i] == 7)
					flag = true;
				else
					initialPopulation[i] = newPopulation[i];
			System.out.println("New Population");
			for (i = 0; i < SIZE; i++)
				System.out.println(newPopulation[i]);

		}
		System.out.println(" Final New Population");
		for (i = 0; i < SIZE; i++)
			System.out.println(newPopulation[i]);

	} // end of main

	private static StringBuilder setInBinary(StringBuilder newb1) {

		switch (newb1.length()) {
		case 1:
			newb1.setLength(3);
			newb1.setCharAt(2, newb1.charAt(0));
			newb1.setCharAt(0, '0');
			newb1.setCharAt(1, '0');
			break;
		case 2:
			newb1.setLength(3);
			newb1.setCharAt(2, newb1.charAt(1));
			newb1.setCharAt(1, newb1.charAt(0));
			newb1.setCharAt(0, '0');
		}
		return newb1;
	}

}
