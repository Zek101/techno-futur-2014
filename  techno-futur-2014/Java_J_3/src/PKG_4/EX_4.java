package PKG_4;

import java.util.Scanner;

public class EX_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int nbr = sc.nextInt();

		for (int i = nbr; i >= 0; i--) {

			if (i % 2 == 0) {
				System.out.print(i);

				if ((i <= nbr) && (i>0))
					System.out.print(",");
			}
		}
		
		
		
	}

}
