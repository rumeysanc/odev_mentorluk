package week_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_3 {
	public static void main(String[] args) {
		/*
		 * Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java
		 * kodunu yaziniz. String str=“ilovejavatoo” Output: o v a
		 */
		String str = "ilovejavatoo";

		tekrarEden(str);

	}

	public static void tekrarEden(String str) {
		String arr[] = new String[str.length()];
		arr = str.split("");
		System.err.println(Arrays.toString(arr));
		List<String> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && !list.contains(arr[i])) {
					list.add(arr[i]);

				}

			}

		}
		System.out.println(list);

	}
}
