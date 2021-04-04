package week_04;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		 
		/*
		Get numbers from the user and output that number consecutive fibonacci number sequence
		     	e.g : User enters 10
		output : 0 1 1  2  3  5 8 13 21 34
		      	*/
Scanner scan = new Scanner(System.in);
System.out.println("Lutfen finonaccinin kac terimini bilmek istiyorsaniz giriniz");
int terimSayisi=scan.nextInt();
int num1=0;
int num2=1;
int num3=0;
System.out.print(num1 + " "+num2);
for (int i =2; i < terimSayisi; i++) {
	num3=num1+num2;
	num1=num2;
	num2=num3;
	System.out.print(" " +num3);			
}
scan.close();
	}

}
