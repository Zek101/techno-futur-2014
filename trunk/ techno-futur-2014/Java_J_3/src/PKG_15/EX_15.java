package PKG_15;

import java.util.Scanner;

public class EX_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x = 0;

		for (int i = 1; i <= 997; i += 2) 
			x = x + (1 / i);

		System.out.println(4*x);
	}

}
