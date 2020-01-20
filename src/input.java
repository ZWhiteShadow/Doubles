import java.util.Scanner;

public class input {

	@SuppressWarnings("resource")
	public static int ReadInputInt() {
		// declare a new Scanner object
		Scanner scan = new Scanner(System.in);

		// read in user input and store it in the scanned variable
		int scanned = scan.nextInt();

		// return the int result to wherever the "StudentHelper.ReadInputInt()" is
		// called
		return scanned;
	}
}