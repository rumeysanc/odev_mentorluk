package week_02;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tane pozitif tam sayi alalim bu uc sayidan ucgen olup olmama
		 * durumunu kontrol edelim eger ucgen olabiliyor ise, es kenar ucgen mi kontrol
		 * edelim.
		 * 
		 * Ucgen olma kosullari. b+c>a>b-c 1 a+c>b>a-c 1 a+b>c>a-b 1
		 * 
		 * Eskenar ucgen olma kosullari. a=b=c
		 * 
		 * Konsolda asagidaki durumlari yazdiralim. Eskenar ucgen Sadece ucgen Ucgen
		 * degildir
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 3 tane pozitf tam sayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();

		ucgenMi(sayi1, sayi2, sayi3);

		scan.close();

	}

	public static void ucgenMi(int a, int b, int c) {

		if (a < 0 || b < 0 || c < 0) {
			System.out.println("kenar uzunluklari negatif olamaz lutfen pozitif sayi giriniz");

		} else {
			if (a == b && b == c && a == c) {
				System.out.println("eskenar ucgen");

			} else if (((b + c > a) && (a > b - c)) && ((a + c > b) && (b > a - c)) && ((a + b > c) && (c > a - b))) {
				System.out.println("sadece ucgen");
			} else {
				System.out.println("ucgen degildir");

			}

		}

	}

}
