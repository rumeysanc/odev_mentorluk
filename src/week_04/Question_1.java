package week_04;

import java.util.Scanner;

public class Question_1 {
	public static void main(String[] args) {
		/*
		Kullanıcıdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez tekrarlandığını kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =“John came late" 
=> Tekrar Sayisi = 2
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir string giriniz");
		String str =scan.nextLine();
		System.out.println("lutfen bir karakter giriniz ");
		char ch=scan.next().charAt(0);
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==ch) {
				count++;
				
			}
			
		}
		System.out.println("str de " +ch + " harfi "+  count+ " defa kullanilmistir");
		scan.close();
	}

}
