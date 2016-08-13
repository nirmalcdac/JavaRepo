public class Equals {
	String name;
	int age;

	public static void main(String args[]) {
		Equals eq1 = new Equals("nirmal", 26);
		Equals eq2 = new Equals("nirmal", 26);

		System.out.println(eq1.equals(eq2));
	}

	public Equals(String string, int i) {
		this.name = string;
		this.age = i;
	}

	public boolean equals(Object obj) {
		Equals equals = (Equals) obj;
		if ((equals.getAge() == this.getAge()) && (equals.getName() == this.getName()) || (obj instanceof Equals)) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
