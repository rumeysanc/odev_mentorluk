package week_01;

import java.util.Scanner;

public class Question4_ilkHafta {

	public static void main(String[] args) {
		 
		/* 4
		Kullanicidan 3 basamakli bir sayi isteyin ve 
		bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
		*/
Scanner scan= new Scanner (System.in) ;
System.out.println("lutfen 3 basamakli bir sayi giriniz");
int sayi= scan.nextInt();
int birlerBas= sayi%10;
int onlarBas= (sayi/10)%10;
int yuzlerBas=sayi/100 ;


if (sayi>=100&&sayi<=999) {
	
	System.out.println(birlerBas+onlarBas+yuzlerBas);
} else if ( sayi<=-100&&sayi>=-999) {
	System.out.println(-1*(birlerBas+onlarBas+yuzlerBas));

	
}else {
	System.out.println("lutfen uc basamakli bir sayi giriniz ");
	
}
scan.close();

	}

}
