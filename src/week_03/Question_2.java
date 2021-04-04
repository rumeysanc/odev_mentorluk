package week_03;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		/*  
		* Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
			*/
Scanner scan=new Scanner(System.in);
System.out.println("lutfen bir ay ismi giriniz");
String ay=scan.next().toLowerCase();
switch (ay) {
case "ocak":
	System.out.println("ocak ayi 31 gundur");
	break;
case "subat":
	System.out.println("subat ayi 28 gundur (dort yilda bir 29 gundur)");
	break;
case "mart":
	System.out.println("mart ayi 31 gundur");
	break;
case "nisan":
	System.out.println("nisan ayi 30 gundur");
	break;
case "mayis":
	System.out.println("mayis ayi 31 gundur");
	break;
case "haziran":
	System.out.println("haziran ayi 30 gundur");
	break;
case "temmuz":
	System.out.println("temmuz ayi 31 gundur");
	break;
case "agustos":
	System.out.println("agustos ayi 31 gundur");
	break;
case "eylul":
	System.out.println("eylul ayi 30 gundur");
	break;
case "ekim":
	System.out.println("ekim ayi 31 gundur");
	break;
case "kasim":
	System.out.println("kasim ayi 30 gundur");
	break;
case "aralik":
	System.out.println("aralik ayi 31 gundur");
	break;
default:
	System.out.println("lutfen gecerli bir ay adi giriniz");
	break;
}
scan.close();
	}

}
