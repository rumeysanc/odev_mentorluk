package week_05;

import java.util.Scanner;

public class Question_1B {

	public static void main(String[] args) {
		/*
		// Stringi ters çevirmek için bir Java Programı yazın

//2.Yol: String Classini kullanarak

*/
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir string giriniz");
		String str=scan.nextLine();
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		scan.close();

	}

}
