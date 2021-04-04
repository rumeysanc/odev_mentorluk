package week_01;

public class Question1_ilkHafta {

	public static void main(String[] args) {

		/*
		 * Asagidaki String degiskenini kullanarak konsolda A L i yazdiriniz. String
		 * pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

		String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//1. yol
		char a = pickName.charAt(0);
		char l = pickName.charAt(11);
		char i = pickName.toLowerCase().charAt(8);
		System.out.println(a + " " + l + " " + i);
//2.yol
		System.out.println(pickName.substring(0, 1) + " " + pickName.substring(11, 12) + " "
				+ pickName.toLowerCase().substring(8, 9));
//3.yol
		System.out.println(pickName.charAt(0) + " " + pickName.charAt(11) + " " + pickName.toLowerCase().charAt(8));

	}

}
