package week_05;

import java.util.Scanner;

public class Question_1C {

	public static void main(String[] args) {
		/*
		 * // Stringi ters çevirmek için bir Java Programı yazın //3.Yol: Bir method
		 * oluşturun, ardından methodu main method dan çağırın
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir string giriniz");
		String str = scan.nextLine();

		tersCevir(str);
		System.out.println(tersCevir(str));
		scan.close();
	}

	public static String tersCevir(String str) {
		String ters = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			ters += str.charAt(i);
		}
		return ters;

	}

}
