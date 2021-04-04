package week_04;

import java.util.Arrays;

public class Question_3IkinciYol {

	public static void main(String[] args) {
		/*
		 * Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java
		 * kodunu yaziniz. String str=“ilovejavatoo” Output: o v a
		 */
		String str="ilovejavatoo";
		int[] arr =new int[str.length()];
		
		for(int i=0;i<str.length();i++)
		arr[str.indexOf(str.substring(i,i+1))]++;
		System.out.println(Arrays.toString(arr));
		
		for(int j=0;j<str.length();j++)
		if(arr[j]>=2)
			
		System.out.print(str.charAt(j)+" ");
		
	
	
			
		}
	}


