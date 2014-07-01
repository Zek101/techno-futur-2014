package PKG_14;

import java.util.Scanner;

public class EX_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double x = 0;

		for (int i = 1; i <= 1000; i++) {
			x = x + (1 / Math.pow(i, 2));

		}

		System.out.println(Math.sqrt(6*x));
	}

}
