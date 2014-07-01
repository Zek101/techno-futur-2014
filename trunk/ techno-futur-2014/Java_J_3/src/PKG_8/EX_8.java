package PKG_8;

import java.util.Scanner;

public class EX_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String phrase = sc.nextLine();

		int nbr = phrase.length();

		for (int i = 0; i < nbr; i++)
			System.out.println(phrase.charAt(i));

	}

}
