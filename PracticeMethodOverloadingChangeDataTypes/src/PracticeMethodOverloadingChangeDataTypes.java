
public class PracticeMethodOverloadingChangeDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = add(1, 2);
		String str = add("1", "2");
		System.out.println(a + " " + str);

	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		int a = i + j;
		return a;
	}

	private static String add(String string, String string2) {
		// TODO Auto-generated method stub
		String str = string.concat(string2);
		return str;
	}

}
