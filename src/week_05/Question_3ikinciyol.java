package week_05;

import java.util.Scanner;

public class Question_3ikinciyol {

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
		System.out.println("lutfen bir sayı giriniz");
		int sayi = scan.nextInt();
		boolean sonuc = false;
		int arr[] = { 3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95 };
		for (int i : arr) {
			if (i == sayi) {
				sonuc = true;
			}
		}
		if (sonuc) {
			System.out.println(" Girdiginiz sayi Arrayde var ");
		} else {
			System.out.println(" Girdiginiz sayi Arrayde yok ");
		}
scan.close();
	} 

}
