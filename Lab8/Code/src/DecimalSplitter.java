public class DecimalSplitter {
	static boolean isOdd(int num) {
		return num % 2 != 0;
	}

	static int getWhole(double num) {
		return (int) num;
	}

	static double getFraction(double num) {
		String str = String.valueOf(num);
		int decimalPointIndex = str.indexOf('.');
		return Double.parseDouble(str.substring(decimalPointIndex));
	}
}
