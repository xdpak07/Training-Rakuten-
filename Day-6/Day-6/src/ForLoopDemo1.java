
public class ForLoopDemo1 {
	/**
	 * printRowOfSize taking an input argument And
	 * Printing "row" number of rows and inside every Iteration
	 * We are Printing it by "row" times and every time
	 * the "row" is getting decremented..
	 * @param row
	 */
	static void printRowOfKSize(int row) {
		if(row <=0) {
			throw new IllegalArgumentException("Row Value should be greater then 0");
		}
		for (; row >= 1; row--) {
			for (int column = 0; column < row; column++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		printRowOfKSize(5);
	}

}
