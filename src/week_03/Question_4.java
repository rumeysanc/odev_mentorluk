package week_03;

public class Question_4 {
	public static void main(String[] args) {
		/*
		 * name1 ve name2 degiskenlerini olusturun. name1 degiskeninin karakter sayisi
		 * cift ise kelimenin ortasina name2 yi yerlestirin. name1 degiskeninin karakter
		 * sayisi tek ise “name1 cift sayili olmadigi icin ortasina yerlestiremedik”
		 * yazdirin. e.g: name1= mehmet name2= ahmet Print ==> mehahmetmet
		 * 
		 */

		String name1 = "Mehmet";
		String name2 = "Can";
		String ilkYari = name1.substring(0, (name1.length() - 1) / 2 + 1);
		String sonYari = name1.substring((name1.length() - 1) / 2 + 1, name1.length());

		if (name1.length() % 2 == 0) {
			System.out.println(ilkYari + name2 + sonYari);

		} else {
			System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

		}
// name1 = Mehmet name2= Can olsun print=MehCanmet
		// name1=Ahmet olsun  Name2 = Can print=name1 cift sayili olmadigi icin ortasina yerlestiremedik

	}

}
