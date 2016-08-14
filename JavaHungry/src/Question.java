public class Question {
	public static void javaHungry(String s) {
		System.out.println("String");
	}

	public static void javaHungry(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] str) {
		javaHungry(null);
	}
}
