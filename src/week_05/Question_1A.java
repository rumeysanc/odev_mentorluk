package week_05;

import java.util.Scanner;

public class Question_1A {

	public static void main(String[] args) {
		/*
		// Stringi ters çevirmek için bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
*/

		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir string giriniz");
		StringBuilder str = new StringBuilder(scan.nextLine());
		
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		
		str.substring(0, 4);
		System.out.println(str.substring(0, 4));
		System.out.println(str);
		
scan.close();



	}

}
