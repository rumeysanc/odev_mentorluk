package week_03;

import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {
		/*
		 * Kullanıcıdan firstName ve lastName'i girmesini isteyin, ardından baş
		 * harflerini büyük harf yapın ve geri kalanı tamamen kucuk harf olarak konsolda
		 * yazdirin. ferhat => Ferhat kirac => Kirac
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen FirstName giriniz");
		String firstName = scan.next();
		System.out.println("lutfen lastName giriniz");
		String lastName = scan.next();
		System.out.println(firstName.toUpperCase().charAt(0) + firstName.substring(1, firstName.length()).toLowerCase());
		System.out.println(lastName.toUpperCase().charAt(0) + lastName.substring(1, lastName.length()).toLowerCase());
scan.close();
	}

}
