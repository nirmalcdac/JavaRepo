class MyClass implements Cloneable {
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} // Calls overridden method.
		catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return obj;
	}
}