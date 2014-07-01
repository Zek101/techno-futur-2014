package PKG_16;

import java.util.Scanner;

public class EX_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nbr = sc.nextInt();
		double fact = 1;

		for (int i = nbr; i > 0; i--)
			fact = fact * i;


		System.out.println(fact);
	}

}
