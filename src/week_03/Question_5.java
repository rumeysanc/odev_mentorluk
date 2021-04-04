package week_03;

import java.util.Scanner;

public class Question_5 {
	public static void main(String[] args) {
		/*
		Kullanıcıdan bir kelime girmesini isteyin.
		 Sözcükte tek sayıda karakter ve 3 veya daha fazla karakter içeriyorsa,
		  kelimenin ortasındaki karakteri yazdırın.
		*/
Scanner scan = new Scanner(System.in);
System.out.println("lutfen bir kelime giriniz");
String str=scan.next();
if (str.length()%2!=0 && str.length()>=3) {
	System.out.println(str.substring((str.length()-1)/2,(str.length()-1)/2+1 ));
	
} else {
	System.out.println("lutfen cift karakterli kelime giriniz");

}
scan.close();
}

}
