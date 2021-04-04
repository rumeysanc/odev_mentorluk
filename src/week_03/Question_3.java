package week_03;

public class Question_3 {
	public static void main(String[] args) {
		/*
		 * Ternary kullanarak: int variable : price string variable : decision price =
		 * $10 ise Print “cheap” price 10-$20 arasi ise Print “ok” diger durumlar icin
		 * “expensive” yazdirin.
		 */
		int price = 40;
		String decision = "";
		decision = price <= 10 ? "cheap" : price > 10 && price < 20 ? "ok" : "expensive";
		if (price < 0) {
			System.out.println("negatif fiyat olmaz");

		} else {
			System.out.println(decision);

		}

	}
}
