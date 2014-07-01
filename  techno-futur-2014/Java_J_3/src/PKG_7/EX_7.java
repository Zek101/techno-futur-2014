package PKG_7;

import java.util.Scanner;

import org.omg.PortableInterceptor.ForwardRequestHelper;

public class EX_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int nbr = sc.nextInt();
		int sum = 0;
		int sum_parity = 0;
		double sum_carr = 0;
		double sum_eps = 0;

		for (int i = 0; i <= nbr; i++)
			sum = sum + i;

		System.out.println(sum);

		for (int i = 0; i <= nbr; i++) {
			if (i % 2 == 0)
				sum_parity = sum_parity + i;
		}
		System.out.println(sum_parity);

		for (int i = 0; i < nbr + 1; i++)
			sum_carr = sum_carr + Math.pow(i, 2);

		System.out.println((int) sum_carr);

		for (int i = 1; i <= nbr; i++)
			sum_eps = sum_eps + (Math.pow(i, 2)) / (i + 1);

		System.out.println(sum_eps);

	}
}
