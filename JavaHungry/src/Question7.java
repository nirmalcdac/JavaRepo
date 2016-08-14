public class Question7 {
	public static void main(String[] str) {
		javaHungryMethod();
	}

	private static int javaHungryMethod() {
		try {
			System.out.println("try");
			int x = 4 / 0;
			return 10;
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			return 88;
		}
	}
}
