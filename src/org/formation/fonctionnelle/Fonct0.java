package org.formation.fonctionnelle;
import java.util.Scanner;

public class Fonct0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 1;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a%10);
		double x = 1;
		double y = 2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(x%10);*/
		
		System.out.println("Enter a integer between 0 and 1000 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int res = n/1000 + (n%1000)/100 + (n%100)/10 + n%10;
		System.out.println("The sum of all digits in " + n + " is " + res);
	}

}
