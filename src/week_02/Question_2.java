package week_02;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		/*
		 * Print "Lütfen iş unvanınızı girin�? “jobTitle�? isimli bir degisken olusturun
		 * ve kullanicidan isteyin. Doğru jobTitle yazdırmak için aşağıdaki test
		 * datalarini kullanın. Example : Eger jobTitle qa ise print “İş unvanınız
		 * Quality Analyst�? test data: qa ise print Quality Analyst dev ise print
		 * Developer ba ise print Business Analyst pm ise print Project Manager
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iş unvanınızı girin");
		String jobTitle = scan.next().toLowerCase();

		if (jobTitle.equals("qa")) {
			System.out.println("Quality Analyst ");

		} else if (jobTitle.equals("dev")) {
			System.out.println("Developer  ");
		} else if (jobTitle.equals("ba")) {
			System.out.println("Business Analyst ");

		} else if (jobTitle.equals("pm")) {
			System.out.println("Project Manager");

		} else {
			System.out.println("lutfen gecerli bir unvan giriniz");

		}
		scan.close();
	}
}
