public class TestMain {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Pass a double val!");
			System.exit(0);
		}

		double num = Double.parseDouble(args[0]);
		int whole = 0;
		double fraction = 0;

		whole = DecimalSplitter.getWhole(num);
		fraction = DecimalSplitter.getFraction(num);

		System.out.println("Whole : " + whole);
		System.out.printf("Fraction : %.3f\n", fraction);

		System.out.println("The number is " + (DecimalSplitter.isOdd(whole) ? "Odd" : "Even"));
	}
}
