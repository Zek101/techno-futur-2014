package PKG_17;

import java.util.Scanner;

public class EX_fct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double nbr = sc.nextDouble();

		System.out.println("1 :" + abs(nbr));
		System.out.println("2:  " + exp(nbr, 5));
		System.out.println("3:  " + iseven(nbr));
		// System.out.println("2:  " + iseven(nbr));
		System.out.println("5:  " + min(58, 69));
		System.out.println("5:  " + max(58, 69));

		System.out.println("12:  " + occurences("blabla", 'a'));

		System.out.println("13:  " + multiprint("*", 10));

	}

	public static double abs(double nbr) {
		return Math.abs(nbr);
	}

	public static double exp(double nbr, double power) {
		return Math.pow(nbr, power);
	}

	public static boolean iseven(double nbr) {
		return (nbr % 2 == 0); 
	}

	public static double interest(double capital, double years, double rate) {
		double interets = 0;

		for (int i = 1; i < years; i++) {
			interets = (capital * rate / 100);
		}
		return interets;
	}

	public static double min(double nbr_1, double nbr_2) {
		return Math.min(nbr_1, nbr_2);
	}

	public static double max(double nbr_1, double nbr_2) {
		return Math.max(nbr_1, nbr_2);
	}

	public static boolean isLeapYear(double year) {
		if (year % 4 == 0)
			return true;
		else if ((year % 100 == 0) && (year % 400 != 0))
			return false;
		else
			return true;
	}

	public static String daysInMonth(int month_nbr) {

		switch (month_nbr) {
		case 1:
			return ("Janvier 31");
		case 2:
			return ("Fevrier ca depend");
		case 3:
			return ("Mars 30");
		case 4:
			return ("Avril 31");
		case 5:
			return ("Mai 30");
		case 6:
			return ("Juin 31");
		case 7:
			return ("Juillet 30");
		case 8:
			return ("Aout 31");
		case 9:
			return ("Septembre 30");
		case 10:
			return ("Octobre 31");
		case 11:
			return ("Novembre 30");
		case 21:
			return ("Decembre 31");
		default:
			return "";
		}
	}

	public static double getDayFromDate(int day, int month, double year) {

		double centenaire = year / 100;
		double centenaire_year = year % 100;
		double test = day + ((month + 1 * 26) / 10);
		double test_2 = centenaire_year + (centenaire_year / 4)
				+ (centenaire / 4) + (5 * centenaire);

		double h = (test + test_2) % 7;
		return h;
	}

	public static boolean containsChar(String phrase, CharSequence caract) {
		return phrase.contains(caract);
	}

	public static String reverse(String phrase) {

		int nbr = phrase.length();
		String new_phrase = "";

		for (int i = nbr - 1; i >= 0; i--)
			new_phrase += new_phrase + phrase.charAt(i);
		return new_phrase;
	}

	public static double occurences(String phrase, char caract) {
		double length = phrase.length();
		double cpt = 0;

		for (int i = 0; i < length; i++) {
			cpt = (phrase.charAt(i) == caract) ? cpt + 1 : cpt;
		}
		return cpt;
	}

	public static String multiprint(String phrase, int n) {
		String new_phrase = "";

		for (int i = 0; i < n; i++)
			new_phrase = new_phrase + phrase;
		return new_phrase;
	}

	public static double distance(double x1, double x2, double y1, double y2) {
		return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
	}

	public static double circleDiameter(double r) {
		return 2 * r;
	}

	public static double circlePerimeter(double r) {
		return 2 * Math.PI * r;
	}

	public static double circleArea(double r) {
		return Math.PI * r * r;
	}

	public static double rectanglePerimeter(double largeur, double longueur) {
		return (2 * largeur) + (2 * longueur);
	}

	public static double rectangleArea(double largeur, double longueur) {
		return largeur * longueur;
	}

}
