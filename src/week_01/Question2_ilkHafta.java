package week_01;

import java.util.Scanner;

public class Question2_ilkHafta {

	public static void main(String[] args) {
		/*
		Ask the user how many tea they drink and how many sugars they use a day.
		Calculate how many kg of sugar is used in a year and print it.
		1 sugar = 1.7 gr
		Sample: Input ⇒
		Tea : 10
		Sugar :2
		Output : 12.41 kg/year
		*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir gunde kac bardak cay ictiginizi giriniz");
		
		double tea= scan.nextDouble() ;
		
		System.out.println("lutfen bir bardak icin kullandiginiz seker adetini giriniz");
		double sugar =scan.nextDouble() ;
		
	//	1.7 gr= 1.7/1000 =>> 0.0017
		  
		double sonuc = tea*(sugar*0.0017)*365 ;
		
		System.out.println(sonuc);

		scan.close();
	}

}
