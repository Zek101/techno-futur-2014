package PKG_12;

import java.util.Scanner;

public class EX_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		for (int i = 0; i < 100; i++) {
			

			if (i % 5 == 0) {
				if (i % 7 == 0) {
					System.out.println("i =" + i + " :");
					System.out.print("Ding ding bottle \n");
				} else {
					System.out.println("i =" + i + " :");
					System.out.print("Ding ding \n");
				}
			} else if (i % 7 == 0) {
				System.out.println("i =" + i + " :");
				System.out.print("Bottle \n");

			}

		}

	}
}
