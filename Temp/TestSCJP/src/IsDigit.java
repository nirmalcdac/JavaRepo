
public class IsDigit {

	public static void main(String args[]) {
		char chars[] = { 'a', '5', 'A', ' ' };
		System.out.println(Character.isDigit(chars[0]) + "");
		System.out.println(Character.isWhitespace(chars[3]) + "");
		System.out.println(Character.isUpperCase(chars[2]));
	}

}
