package week_05;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {

		/*
		 * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
		 * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
		 * yaziniz
		 *
		 * Array={3,5,21,32,34,45,56,57,76,87,95}
		 *
		 * Input : 5 Output: Girdiginiz sayi Arrayde var Input : 15 Output: Girdiginiz
		 * sayi Arrayde yok
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 100 den kucuk bir sayi giriniz");
		int sayi = scan.nextInt();
		if (sayi < 100) {
			varMiYokMu(sayi);

		} else {
			System.out.println("100 den buyuk sayi girdiniz");
		}

		scan.close();
	}

	public static void varMiYokMu(int sayi) {
		boolean sonuc = false;
		int arr[] = { 3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sayi) {
				sonuc = true;
			} else {
				sonuc = false;
			}

		}
		if (sonuc) {
			System.out.println(sayi + " Girdiginiz sayi Arrayde var");

		} else {
			System.out.println(sayi + " Girdiginiz sayi Arrayde yok");
		}
	}

}
