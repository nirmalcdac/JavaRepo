public class Question2 {
	public static void javaHungry(String s) {
		System.out.println("String");
	}

	public static void javaHungry1(Integer i)// remove 1 from this method name
												// to see the effect
	{
		System.out.println("Integer");
	}

	public static void javaHungry(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] str) {
		javaHungry(null);
	}
}
