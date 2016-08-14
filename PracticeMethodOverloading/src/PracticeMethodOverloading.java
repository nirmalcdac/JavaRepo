//This is an example of method overloading by changing number of data Arguments.
public class PracticeMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = add(5, 7);
		int k1 = add(1, 2, 3);
		System.out.print(k + " " + k1);

	}

	private static int add(int i, int j, int k) {
		// TODO Auto-generated method stub
		int k1 = i + j + k;
		return k1;
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		int k = i + j;
		return k;

	}

}
