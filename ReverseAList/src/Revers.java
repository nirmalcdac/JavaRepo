import java.util.*;

class Revers {
	public static void main(String args[]) {
		ArrayList<String> mylist = new ArrayList<String>();
		String s = "my";
		String s1 = "name";
		String s2 = "is";
		String s3 = "nirmal";
		mylist.add(s);
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);
		int size = mylist.size();
		for (int i = 0; i < size; i++) {
			System.out.println(mylist.get(i));
		}
		Collections.reverse(mylist);
		for (int i = 0; i < size; i++) {
			System.out.println(mylist.get(i));
		}
	}
}