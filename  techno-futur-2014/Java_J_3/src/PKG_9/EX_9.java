package PKG_9;

import java.util.Scanner;

public class EX_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

		String phrase = sc.nextLine();

		int nbr = phrase.length();
		System.out.println(nbr);

		for (int i = nbr-1; i >= 0; i--)
			System.out.print(phrase.charAt(i));

	}

}
