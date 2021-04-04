package week_03;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		 
		/* 			
		           Kullanıcının girmiş olduğu A,B,C,D,F notlarının karşılığını yazdıran Switch Case java kodunu yazınız.					
		           A	Excellent				
		           B	Good				
		           C	Average				
		           D	Deficient				
		           F	Failing								
				 */
Scanner scan= new Scanner(System.in);
System.out.println("lutfen sinav notunuzu harf ile giriniz");
char sinavNotu=scan.next().toUpperCase().charAt(0);
switch (sinavNotu) {
case 'A':
	System.out.println("notunuzun karsiligi 'Excellent'");
	
	break;
case 'B':
	System.out.println("notunuzun karsiligi 'Good'");
	
	break;
case 'C':
	System.out.println("notunuzun karsiligi 'Average'");
	
	break;
case 'D':
	System.out.println("notunuzun karsiligi 'Deficient'");
	
	break;
case 'F':
	System.out.println("notunuzun karsiligi 'Failing'");
	
	break;

default:
	System.out.println("lutfen gecerli bir not giriniz");
	break;
}
scan.close();

	}

}
