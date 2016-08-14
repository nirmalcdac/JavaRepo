import java.util.*;

class Revers {
	public static void main(String args[]) {
		ArrayList<String> mylist = new ArrayList<String>();
		String mains_string = "my name is nirmal";
		String new_string = mains_string + '\0';
		int len = new_string.length();
		int start_point = 0;
		int g = 0;
		for (int i = 0; i < len; i++) {
			start_point = g;
			if ((new_string.charAt(i) == ' ') || i == len - 1) {
				String temp = new_string.substring(start_point, i);
				mylist.add(temp);
				g = i + 1;
			}
		}
		int size = mylist.size();
		System.out.println("main string");
		for (int i = 0; i < size; i++) {
			System.out.print(mylist.get(i) + " ");
		}
		Collections.reverse(mylist);
		System.out.println("\n" + "updated string");
		for (int i = 0; i < size; i++) {
			System.out.print(mylist.get(i) + " ");
		}
	}
}