package PKG_5;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nbr = sc.nextInt();

		// System.out.println(nbr);

		for (int i = 0; i <= nbr; i++) {
			System.out.print(Math.pow(i, 2));

			if (i != nbr)
				System.out.print(",");

		}
	}

}
