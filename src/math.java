public class math {

	public static double doubleMe(double val) {
		return val * 2;
	}

	public static double quadrupleMe(double val) {

		return doubleMe(doubleMe(val));
	}

	public static double doubleMeTimes(double val, double count) {
		double result = val;
		for (double i = 0; i < count; i++) {
			result = doubleMe(result);
		}
		return result;
	}

	public static void message(String label, double var) {
		int value = (int) var;
		if (value < 2147483647) {
			System.out.print(label + ": " + value + "\n");
		} else {
			System.out.print(label + ": " + var + "\n");
		}

	}

}