package PKG_11;

import java.util.Scanner;

public class EX_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String phrase = sc.nextLine();
		char caract = sc.nextLine().charAt(0);

		int length = phrase.length();
		int sum = 0;

		for (int i = 0; i < length; i++) {

			if ((phrase.charAt(i) == caract))
				sum = sum + 1;
		}

		System.out.println(sum);
	}

}
