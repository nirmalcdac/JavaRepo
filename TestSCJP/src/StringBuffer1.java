
public class StringBuffer1 {
	public static void main(String args[]) {
		StringBuffer c = new StringBuffer("Hello");
		StringBuffer c1 = new StringBuffer("World");
		c.append(c1);
		System.out.println(c);
	}

}
