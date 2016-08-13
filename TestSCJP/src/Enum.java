import java.util.*;

public class Enum {
	public static void main(String args[]) {

		Hashtable<String, String> vars = new Hashtable<String, String>();

		vars.put("POSTCODE", "TU1 3ZU");
		vars.put("EMAIL", "job.blogs@lumesse.com");
		vars.put("DOB", "02 Mar 1983");

		Enumeration<String> e = vars.keys();

		while (e.hasMoreElements()) {
			String param = (String) e.nextElement();
			System.out.println(param);
		}
	}
}