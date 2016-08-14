import java.util.Scanner;
 
public class SecurityLogin {
 
	//Only valid credentials [0] = username, [1] = password
	private static String[] admin = { "ram", "ram" };
 
	private SecurityLogin() {
	}
 
	/**
	 * Validates whether user input matches stored credentials
	 * @param user User's attempt at 'Username'
	 * @param pass User's attempt at 'Password'
	 * @throws SecurityBreachException Thrown when details don't match
	 */
	public static void validateLogin(String user, String pass) throws SecurityBreachException {
		if (user.equals(admin[0]) && pass.equals(admin[1])) {
			System.out.printf("Welcome %s, you are now successfully logged in.", user); //match
		} else {
			throw new SecurityBreachException(); //No match, throw exception
		}
	}
 
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
 
		System.out.println("Enter a Username: ");
		String iUser = input.next();
 
		System.out.println("Enter a Password: ");
		String iPass = input.next();
 
		try {
			SecurityLogin.validateLogin(iUser, iPass);
		} catch (SecurityBreachException e) {
			System.out.println("Login Failed!");
		}
	}
}