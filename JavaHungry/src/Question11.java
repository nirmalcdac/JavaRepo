//http://javahungry.blogspot.com/p/blog-page_10.html

class Question11 extends Thread {
	public static void main(String[] str) throws InterruptedException {
		String s1 = "abc";
		String s2 = s1;
		System.out.println(s1 + " " + s2 + " " + (s1 == s2));

		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1 + " " + sb2 + " " + (s1 == s2));
	}
}

// output
// abc abc true
// abcd abcd true