
public class Control implements Cloneable {
	int controlid = 1;

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return obj;
	}
}
