/**
 * @author NIRMAL
 *
 */

// Door class where all execution will be done
public class DoorExecution {
	public static boolean[] executePass(boolean[] doors, int numberOfDoors) {
		int i, j;
		try {
			for (i = 1; i < (numberOfDoors + 1); i++)// first loop will go from
														// start to end(1-100)
			{
				// i will be assigned to j. In case of 1 it will be 1 and so on
				j = i;
				while (j < (numberOfDoors + 1)) {
					doors[j - 1] = !doors[j - 1];// toggle of door
					j = j + i; // This will decide the next value for each case.
								// in case of 1 it will be 2, for 6 it will be
								// 12 and so on
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
		return doors;// this will return whole boolean array
	}
}