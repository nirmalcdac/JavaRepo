class A {
	int i, j;

	A() {
		i = 1;
		j = 2;

	}
}

public class EqualToWithoutOverride {
	public static void main(String args[]) {
		A obj1 = new A();
		A obj2 = new A();
		System.out.println(obj1.equals(obj2));
	}
}