package week_02;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements�? class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */
		// Not : kullanici gun ay ve yil bilgilerini dogtu giriyor
		Scanner scan = new Scanner(System.in);
		System.out
				.println("lutfen firstPerson Sırasıyla \n gun \n ay \n yil \n olacak şekilde doğum tarihini giriniz:");
		int gun1 = scan.nextInt();
		int ay1 = scan.nextInt();
		int yil1 = scan.nextInt();

		System.out
				.println("lutfen secondPerson Sırasıyla \n gun \n ay \n yil \n olacak şekilde doğum tarihini giriniz:");
		int gun2 = scan.nextInt();
		int ay2 = scan.nextInt();
		int yil2 = scan.nextInt();

		if ((gun1 > 0 && gun1 < 32) && (gun2 > 0 && gun2 < 32) && (ay1 > 0 && ay1 < 13) && (ay2 > 0 && ay2 < 13)) {
			if (yil1 == yil2) {
				if (ay1 == ay2) {
					if (gun1 == gun2) {
						System.out.println("ayni yastalar");

					} else {
						if (gun1 > gun2) {
							System.out.println("secondPerson is older");

						} else {
							System.out.println(" firstPerson is older");

						}

					}

				} else {
					if (ay1 > ay2) {
						System.out.println("secondPerson is older");

					} else {
						System.out.println(" firstPerson is older");

					}

				}

			} else {
				if (yil1 > yil2) {
					System.out.println("secondPerson is older");

				} else {
					System.out.println(" firstPerson is older");
				}

			}

		} else {
			System.out.println("lutfen gecerli bir tarih giriniz");

		}
		scan.close();
	}
}