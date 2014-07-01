package PKG_13;

import java.util.Scanner;

public class EX_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double avg = 0;
		int saisie = 0;
		int nbr_saisies = 0;

		do {
			saisie = sc.nextInt();

			System.out.println("saisie " + saisie);
			if (saisie > -1) {
				avg = avg + saisie;
				System.out.println("avg " + avg);
				
				nbr_saisies=nbr_saisies+1;
			}
		} while (saisie > -1);

		System.out.println(avg / nbr_saisies);
	}

}
