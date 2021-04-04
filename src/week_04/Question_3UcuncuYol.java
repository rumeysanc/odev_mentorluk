package week_04;

public class Question_3UcuncuYol {

	public static void main(String[] args) {
		String s="AAABBBCCCD";
		String tekrar="";
		
		
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
			if(s.charAt(i)==s.charAt(j) && tekrar.indexOf(s.charAt(i))<0) {
				tekrar+=s.charAt(i);
				}
			}
		}
		System.out.println(tekrar);
	}

}
