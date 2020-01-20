public class HandsOn {

	public static void main(String[] args) {

		// Double your number
		System.out.print("Number to Double:");
		double val = input.ReadInputInt();
		math.message("Value", val);
		math.message("Doubled", math.doubleMe(val));
		br();

		// Quadruple your number
		System.out.print("Number to Quadruple:");
		val = input.ReadInputInt();
		math.message("Value", val);
		math.message("Quadrupled", math.quadrupleMe(val));
		br();

		// Double number X times!
		System.out.print("Number to Double X Times:");
		val = input.ReadInputInt();
		System.out.print("X:");
		double count = input.ReadInputInt();
		math.message("Value", val);
		math.message("Times", count);
		math.message("Result", math.doubleMeTimes(val, count));
		br();
	}

	public static void br() {
		System.out.print("\n");
	}

}
