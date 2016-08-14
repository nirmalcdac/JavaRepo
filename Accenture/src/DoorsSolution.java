
/**
 * @author NIRMAL
 *
 */
import java.util.Scanner; //Will be used to take input

//Here we go with our main class
public class DoorsSolution {
	public static void main(String[] args) throws Exception {
		System.out.println("Please provide number of doors:");
		Scanner in = new Scanner(System.in);// To take input from user create
											// stream
		int numberOfDoors = in.nextInt();// convert it in integer
		in.close();// close scanner to release stream
		boolean[] doors = new boolean[numberOfDoors];// Declare and define
														// boolean array

		System.out.println("Before execution\n");

		// Display starting array
		try {
			for (int i = 0; i < (numberOfDoors); i++) {
				System.out.println("Door #" + (i + 1) + " is " + (doors[i] ? "open." : "closed."));
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
		// calling function executePass of class DoorExecution
		doors = DoorExecution.executePass(doors, numberOfDoors);

		// Display manipulated array
		System.out.println("After execution\n");
		try {
			for (int i = 0; i < (numberOfDoors); i++) {
				System.out.println("Door #" + (i + 1) + " is " + (doors[i] ? "open." : "closed."));
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
	}
}
