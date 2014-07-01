package PKG_1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int nbr = sc.nextInt();

		for (int i = 0; i < nbr + 1; i++) {
			System.out.print(i );

			if (i < nbr + 1)
				System.out.print(",");
			System.out.print("Bonjour Pierre");

		}

	}

}
