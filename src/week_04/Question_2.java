package week_04;

public class Question_2 {

	public static void main(String[] args) {
		/*
		 * 1-20 arasindaki -20 dahil olmak üzere- çift sayıları yazdırın. e.g.2 4 6 ..
		 * 20
		 * 
		 * 
		 * 1-20 arasindaki 20 dahil olmak üzere- tek sayıları yazdırın. e.g
		 * 1,3,5,7,...,19 Virgul dahil!
		 * 
		 * 
		 * 20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin.
		 * e.g.20,15,10,5
		 * 
		 * 1 - 20 arasındaki tüm çift sayıların toplamını bulun.
		 * 
		 * 11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue
		 * kullanin.
		 */
		int sayi1 = 1;
		int sayi2 = 20;
		System.out.print("cift sayilar: ");
		ciftSayiyazdir(sayi1, sayi2);
		System.out.println();
		System.out.println("======================================");

		System.out.print("tek sayila: ");
		tekSayiYazdir(sayi1, sayi2);
		System.out.println();
		System.out.println("======================================");

		System.out.print("geriye dogru beser beser sayma: ");
		geriyeBeserYazdir(sayi1, sayi2);
		System.out.println();
		System.out.println("======================================");

		ciftSayilariTopla(sayi1, sayi2);
		System.out.println("cift sayilarin toplami: " + ciftSayilariTopla(sayi1, sayi2));
		System.out.println();
		System.out.println("======================================");

		System.out.print("11 ve 15 'i yazdirmama continue: ");
		onbirVeOnbesYazdirmaContinue(sayi1, sayi2);
		System.out.println();
		System.out.println("======================================");

	}

	public static void onbirVeOnbesYazdirmaContinue(int sayiIlk, int sayiSon) {
		for (int i = sayiIlk; i <= sayiSon; i++) {
			if (i == 11 || i == 15) {
				continue;

			}
			System.out.print(i + ", ");
		}

	}

	public static int ciftSayilariTopla(int sayiIlk, int sayiSon) {
		int toplam = 0;
		for (int i = sayiIlk; i <= sayiSon; i++) {
			if (i % 2 == 0) {
				toplam += i;
			}
		}
		return toplam;

	}

	public static void geriyeBeserYazdir(int sayiIlk, int sayiSon) {
		for (int i = sayiSon; i > sayiIlk; i--) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void tekSayiYazdir(int sayiIlk, int sayiSon) {
		for (int i = sayiIlk; i <= sayiSon; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ,");
			}
		}
	}

	private static void ciftSayiyazdir(int sayiIlk, int sayiSon) {
		for (int i = sayiIlk; i <= sayiSon; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
