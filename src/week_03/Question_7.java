package week_03;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		/*
		 * StringMethods: Çift uzunlukta bir degiskenin ilk yarısını konsolda yazdirmak
		 * için bir Java programı yazıniz. ORNEK: INPUT : Python OUTPUT : Pyt
		 */

		String str = "Python";

		String ilkYari = str.substring(0, str.length() / 2);
		System.out.println(ilkYari);

		// ikinci kisim
		// kullanicidan alip yapalim
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen cift uzunluklu bir string giriniz");
		String str1 = scan.nextLine();
		
		if (str1.length()%2==0) {
			System.out.println(str1.substring(0, str1.length() / 2));
			
		} else {
			System.out.println("lutfen cift uzunluklu string giriniz");

		}
scan.close();
	}

}
