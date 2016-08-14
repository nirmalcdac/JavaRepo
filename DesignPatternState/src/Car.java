import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
	public static void main(String[] args) {
		ApplyBreak ab = new ApplyBreak();
		while (true) {
			System.out.print("Press ");
			get_line();
			ab.applybreak();
		}
	}

	static String get_line() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return line;
	}
}